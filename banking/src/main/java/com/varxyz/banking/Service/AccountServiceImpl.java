package com.varxyz.banking.Service;

import java.util.List;

import com.varxyz.banking.domain.Account;

public class AccountServiceImpl implements AccountService{

	@Override
	public void addAccount(Account account) {
		dao.addAccount(account);
	}

	@Override
	public List<Account> checkingAccount(String customerId) {
		return dao.checkingAccount(customerId);
	}

	@Override
	public List<Account> balanceAccount(String accountNum) {
		return dao.balanceAccount(accountNum);
	}

	@Override
	public void sendAccount(double balance, String accountNum) {
		dao.SendAccount(balance, accountNum);
	}
}
