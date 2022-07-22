package com.varxyz.jvx330.lifecycle.jdbc.example2;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.lifecycle.DataSourceConfig;
import com.varxyz.jvx330.lifecycle.jdbc.Customer;

public class FindCustomerByRegDateDao {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		CustomerDao dao = context.getBean("customerDao",CustomerDao.class);
		findCustomerByRegDate(dao);
		context.close();
	}

	private static void findCustomerByRegDate(CustomerDao dao) {
		System.out.println("findCustomerByRegDate");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date currentDate = null;
		try {
			currentDate = format.parse(format.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<Customer> list = dao.findCustomerByRegDate(currentDate);
		for(Customer customer: list) {
			System.out.println(customer);
		}
	}
}
