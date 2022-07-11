package com.varxyz.banking.domain;

public class BankingTest {
	public static void main(String[] args) {
		SavingsAccount savingAccount = new SavingsAccount(null, 0);
		savingAccount.deposite(5000);
		
		CheckingAccount checkingAccount = new CheckingAccount(null, 0, 0);
		checkingAccount.deposite(3000);
		checkingAccount.withdraw(50000);
		checkingAccount.setOverdraftAmount(2000);
	}
}
