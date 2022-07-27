package com.varxyz.banking.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
	private String userId;
	private String passwd;
	private String name;
	private String ssn;
	private String phone;
	
	public Customer(String userId) {
		this.userId = userId;
	}
}
