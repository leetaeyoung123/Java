package com.varxyz.banking.test;

public class BankingTest {
	public static void main(String[] args) {
		Account account1 = new Account();
		Account account2 = new Account();
		BankingServiceImpl bankingServiceImpl = new BankingServiceImpl();
		
		account1.setBalance(1000);
		account1.setAccountNum("111-11-1111");
		
		account2.setBalance(1000);
		account2.setAccountNum("222-22-2222");
		
		bankingServiceImpl.transfer(500, account1.getAccountNum(), account2.getAccountNum());
	}
}
