package com.varxyz.jvx330.lifecycle.jdbc.example6;


import static java.sql.Types.BIGINT;
import static java.sql.Types.CHAR;
import static java.sql.Types.DOUBLE;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Order;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.varxyz.jvx330.lifecycle.jdbc.Account;

@Repository("accountDao")
public class AccountDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AccountDao(DataSource dateSource) {
		jdbcTemplate = new JdbcTemplate(dateSource);
	}
	
	public List<Account> findAllAccount(){
		String sql = "SELECT * FROM Account";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class));

	}
	
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account (accountNum, accType, balance,"
				+ "interestRate, overAmount, customerId)";
		SavingsAccount sa = null;
		CheckingAccount ca = null;
		Object[] args = null;
		int [] types = new int[] {CHAR, CHAR, DOUBLE, DOUBLE, DOUBLE, BIGINT};
		
		if(account instanceof SavingsAccount) {
			sa = (SavingsAccount)account;
			args = new Object[] {
					sa.getAccountNum(), String.valueOf(sa.getAccType()),
					sa.getBalance(), sa.getInterestRate(), 0.0, 
					sa.getCustomer().getCid()
			};
		}else {
			ca = (CheckingAccount)account;
			args = new Object[] {
					ca.getAccountNum(), String.valueOf(ca.getAccType()),
					ca.getBalance(), 0.0, ca.getOverdraftAmount(),  
					ca.getCustomer().getCid()	
			};
		}
		jdbcTemplate.update(sql, args, types);
	}
	
	public List<Account> findAccountByCustomerId(long customerId){
		String sql = "SELECT * FROM Account WHERE customerId = ?";
		return jdbcTemplate.query(sql, new AccountRowMapper(), customerId);

	}
	public List<Account> findAccountBySsn(String ssn){
		String sql = "SELECT * FROM Account a INNER JOIN Customer c "
				+ "ON a.customerId = c.cid WHERE c.ssn = ?";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class), ssn);
	}
	
	public Page<Account> findAll(Pageable pageable) {
		Order order = pageable.getSort().isEmpty() ? Order.by("aid") : pageable.getSort().toList().get(0);
		String sql = "SELECT * FROM Account a INNER JOIN Customer c "
				+ " ON a.customerId = c.cid "
				+ " ORDER BY " + order.getProperty() + " " + order.getDirection().name()
				+ " LIMIT " + pageable.getPageSize() 
				+ " OFFSET " + pageable.getOffset();
		
		return new PageImpl<Account>(
				jdbcTemplate.query(sql, new AccountRowMapper()),
				pageable,
				countAccount());
	}
	
	public long countAccount() {
		String sql = "SELECT * FROM Account";
		return jdbcTemplate.queryForObject(sql, Long.class);
	}
}
