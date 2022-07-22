package com.varxyz.jvx330.lifecycle.jdbc.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.lifecycle.DataSourceConfig;

public class FindCustomerByEmailDao {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		CustomerDao2 dao = context.getBean("customerDao2", CustomerDao2.class);
		findCustomerByEmail(dao);
		context.close();
	}

	private static void findCustomerByEmail(CustomerDao2 dao) {
		System.out.println("findCustomerByEmail: " 
	+ dao.findCustomerByEmail("java@naver.com"));
		
	}
}
