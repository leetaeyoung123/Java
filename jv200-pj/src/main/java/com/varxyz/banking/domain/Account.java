package com.varxyz.banking.domain;

public class Account {
	protected String accountNum;	// 계좌번호
	protected double balance;	// 잔액, protected를 써야 자식이 쓸수 있음.
	protected Customer customer;
	
	public Account() {
		
	}
	
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	// Account 생성자 : 계좌번호와 초기 입금금액을 받음
	
	public void deposite(double amount) {
		this.balance += amount;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	
	
	
//	public void deposite(double amount) {	// 예금
//		System.out.println("입금 전 금액: " + balance + "원");
//		this.balance += amount;
//		System.out.println(amount + "원" + " 입금을 완료했습니다.\n" + "입금 후 금액: " + balance + "원\n");
//	}
}
