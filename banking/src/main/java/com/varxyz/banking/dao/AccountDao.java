package com.varxyz.banking.dao;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.banking.domain.Account;

public class AccountDao {
	private JdbcTemplate jdbcTemplate;
	
	public AccountDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account (customerId, accountNUM, "
				+ "accType, balance, interestRate, overAmount)"
				+ " VALUES(?, ?, ?, ?, ?, ?)";
		if(account.getAccType() == "S") {
			jdbcTemplate.update(sql, account.getCustomerId(),
					account.getAccountNum(),
					account.getAccType(), account.getBalance(), 
					account.getInterestRate(), 0.0);	
		}else {
			jdbcTemplate.update(sql,account.getCustomerId(),
					account.getAccountNum(),
					account.getAccType(), account.getBalance(), 
					0.0, account.getOverAmount());
		}	
	}
	
	public List<Account> getAccounts(String customerId) {
		String sql = "SELECT * FROM Account WHERE customerId = ?";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class), customerId);
	}
	
	public List<Account> getBalance(String accountNum){
		String sql = "SELECT balance, accountNum FROM Account WHERE accountNum = ?";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class), accountNum);
	}
		
	public double withdrawal(double balance, String accountNum) {
		String sql = "UPDATE Account SET balance = ? WHERE accountNum = ?";
		return jdbcTemplate.update(sql, (getBalance(accountNum)).get(0).getBalance()-balance, accountNum);
	}
	
	public double deposit(double balance, String accountNum) {
		String sql = "UPDATE Account SET balance = ? WHERE accountNum = ?";
		return jdbcTemplate.update(sql, (getBalance(accountNum)).get(0).getBalance()+balance, accountNum);
	}
}
