package com.varxyz.banking.test;

import com.varxyz.banking.domain.Account;

public class BankingServiceImpl implements BankingService{
	
	@Override
	public double getBalance(String accountNum) {
		return 0;
	}

	@Override
	public boolean transfer(double amount, String sendAccount, String getAccount) {
		Account send_Account = new Account();
		Account get_Account = new Account();
		send_Account.setBalance(withdrawal(amount, sendAccount));
		get_Account.setBalance(deposit(amount, getAccount));
		return true;
	}

	@Override
	public double withdrawal(double balance, String accountNum) {
		Account account = new Account ();
		account.setBalance(getBalance(accountNum) - balance);
		return getBalance(accountNum) - balance;
	}



	@Override
	public double deposit(double balance, String accountNum) {
		Account account = new Account ();
		account.setBalance(getBalance(accountNum) + balance);
		return getBalance(accountNum) + balance;
	}
}
