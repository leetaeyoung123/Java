package com.varxyz.jvx330.lifecycle.jdbc.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.lifecycle.DataSourceConfig;

public class CountCustomersDao {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
		countCustomers(dao);
		context.close();
	}
	
	public static void countCustomers(CustomerDao dao) {
		System.out.println("count: " + dao.countCustomers());
	}

}
