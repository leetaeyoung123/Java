package com.varxyz.banking.domain;

public class InsufficientBalance extends RuntimeException {
	public InsufficientBalance(String msg) {
		super(msg);
	}
}
