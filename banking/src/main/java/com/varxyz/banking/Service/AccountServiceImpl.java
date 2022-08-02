package com.varxyz.banking.Service;

import java.util.List;

import com.varxyz.banking.domain.Account;

public class AccountServiceImpl implements AccountService{

	@Override
	public void addAccount(Account account) {
		dao.addAccount(account);
	}

	@Override
	public List<Account> getAccounts(String customerId) {
		return dao.getAccounts(customerId);
	}

	@Override
	public List<Account> getBalance(String accountNum) {
		return dao.getBalance(accountNum);
	}

	@Override
	public double withdrawal(double balance, String accountNum) {
		return dao.withdrawal(balance, accountNum);
	}

	@Override
	public double deposit(double balance, String accountNum) {
		return dao.deposit(balance, accountNum);
		
	}

	@Override
	public boolean transfer(double amount, String sendAccount, String getAccount) {
		Account send_Account = new Account();
		Account get_Account = new Account();
		send_Account.setBalance(withdrawal(amount, sendAccount));
		get_Account.setBalance(deposit(amount, getAccount));
		return true;
	}
}
