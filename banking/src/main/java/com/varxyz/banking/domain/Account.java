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
	
	public Account() {
		super();
	}
	
	public Account(String customerId) {
		this.customerId = customerId;
	}
}
