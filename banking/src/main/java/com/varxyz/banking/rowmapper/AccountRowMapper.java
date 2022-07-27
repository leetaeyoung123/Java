package com.varxyz.banking.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.varxyz.banking.domain.Account;

public class AccountRowMapper implements RowMapper<Account> {

	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = new Account();
		if(rs.getDouble("balance") > account.getBalance()) {
			account.setBalance(rs.getDouble("balance") - account.getBalance());
			account.getAccountNum();
		}
		return account;
	}
}
