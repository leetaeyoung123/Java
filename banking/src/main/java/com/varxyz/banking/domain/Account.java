package com.varxyz.banking.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Account {
	private String accountNum;
	private String accType;
	private double balance;
	private double interestRate;
	private double overAmount;
	private String customerId;
	private String sendAccount;
	private String getAccount;
	private double amount;
	
	public Account() {
		super();
	}
	
	public Account(String customerId) {
		this.customerId = customerId;
	}
}
