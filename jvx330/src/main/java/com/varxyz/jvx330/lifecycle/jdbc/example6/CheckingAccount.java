package com.varxyz.jvx330.lifecycle.jdbc.example6;

import com.varxyz.jvx330.lifecycle.jdbc.Account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckingAccount extends Account{
	private double overdraftAmount;
}
