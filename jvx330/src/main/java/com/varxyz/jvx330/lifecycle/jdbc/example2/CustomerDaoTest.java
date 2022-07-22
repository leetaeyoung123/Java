package com.varxyz.jvx330.lifecycle.jdbc.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.lifecycle.DataSourceConfig;

public class CustomerDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
		findAllCustomers(dao);
		
		context.close();
		
	}
	
	public static void findAllCustomers(CustomerDao dao) {
		System.out.println("[find all customer()]");
		dao.findAllCustomer().forEach(c -> System.out.println(c));
	}
}
