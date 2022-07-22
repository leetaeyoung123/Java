package com.varxyz.jvx330.lifecycle.jdbc.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.lifecycle.DataSourceConfig;
import com.varxyz.jvx330.lifecycle.jdbc.Customer;

public class AddCustomerDao2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		AddCustomerDao dao = 
				context.getBean("addCustomerDao", AddCustomerDao.class);
		
//		addCustomer(dao);
//		addCustomer2(dao);
		addCustomer3(dao);
		context.close();
	}
	public static void addCustomer(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("spring@naver.com");
		c.setPasswd("1234");
		c.setName("spring");
		c.setSsn("123456-1234561");
		c.setPhone("010-1234-1234");
		System.out.println("inserted");
		dao.addCustomer(c);
	}
	
	public static void addCustomer2(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("python@naver.com");
		c.setPasswd("1234");
		c.setName("spring");
		c.setSsn("123456-1234561");
		c.setPhone("010-1234-1234");
		System.out.println("inserted2");
		dao.addCustomer2(c);
	}
	public static void addCustomer3(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("jsp@naver.com");
		c.setPasswd("1234");
		c.setName("jsp");
		c.setSsn("123456-1234561");
		c.setPhone("010-1234-1234");
		
		long key = dao.addCustomer3(c);
		System.out.println("-key: " + key);
		dao.addCustomer3(c);
	}
	
		
}

