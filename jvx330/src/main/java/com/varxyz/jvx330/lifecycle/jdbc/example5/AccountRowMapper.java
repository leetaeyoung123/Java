package com.varxyz.jvx330.lifecycle.jdbc.example5;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.varxyz.jvx330.lifecycle.jdbc.Account;
import com.varxyz.jvx330.lifecycle.jdbc.Customer;

public class AccountRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = null;
		char accType = rs.getString("accType").charAt(0);
		if(accType == 'C') {
			account = new CheckingAccount();
			CheckingAccount ca = (CheckingAccount)account;
			ca.setOverdraftAmount(rs.getDouble("overAmount"));
		}else {
			account = new SavingsAccount();
			SavingsAccount sa = (SavingsAccount)account;
			sa.setInterestRate(rs.getDouble("interestRate"));
		}
		account.setAid(rs.getLong("aid"));
		account.setCustomer(new Customer(rs.getLong("customerId")));
		account.setAccountNum(rs.getString("accountNum"));
		account.setAccType(accType);
		account.setBalance(rs.getDouble("balance"));
		account.setRegDate(rs.getTime("regDate"));
		return account;
	}

}
