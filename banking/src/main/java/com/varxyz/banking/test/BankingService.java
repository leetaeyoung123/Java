package com.varxyz.banking.test;

public interface BankingService {
	public double withdrawal(double balance, String accountNum);
	public double deposit(double balance, String accountNum);
	public boolean transfer(double amount, String sendAccount, String getAccount);
	public double getBalance(String accountNum);
}
