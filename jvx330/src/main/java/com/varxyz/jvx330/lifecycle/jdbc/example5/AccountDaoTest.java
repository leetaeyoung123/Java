package com.varxyz.jvx330.lifecycle.jdbc.example5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.lifecycle.jdbc.Account;
import com.varxyz.jvx330.lifecycle.jdbc.Customer;

public class AccountDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Example5Config.class);
		
		AccountDao dao = context.getBean("accountDao", AccountDao.class);
		//----------------------------------------------------------------
		Account a = new Account();
		System.out.println("Account insert start");
		a.setCustomer(new Customer(1001));
		a.setAccType('S');
		a.setAccountNum("508-12-6789");
		a.setBalance(1000);
		a.setInterestRate(0.2);
		dao.addAccount(a);
		System.out.println("Account insert end");
		//----------------------------------------------------------------
		findAllAccount(dao);
		System.out.println("");
		//----------------------------------------------------------------
		findAccountByCustomerId(dao);
		System.out.println("");
		findAccountBySsn(dao);
		System.out.println("");
		context.close();
	}
	private static void findAllAccount(AccountDao dao) {
		System.out.println("findAllaccount called");
		dao.findAllAccount().forEach(c -> System.out.println(c));
	}
	
	private static void findAccountByCustomerId(AccountDao dao) {
		System.out.println("findAccountByCustomerId called");
		System.out.println(dao.findAccountByCustomerId(1001));
	}
	
	private static void findAccountBySsn(AccountDao dao) {
		System.out.println("findAccountBySsn called");
		System.out.println(dao.findAccountBySsn("123456-1234567"));
	}
}
