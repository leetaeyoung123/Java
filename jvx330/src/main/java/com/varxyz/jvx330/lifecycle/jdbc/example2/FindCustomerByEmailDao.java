//package com.varxyz.jvx330.lifecycle.jdbc.example2;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.varxyz.jvx330.lifecycle.DataSourceConfig;
//
//public class FindCustomerByEmailDao {
//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = 
//				new AnnotationConfigApplicationContext(DataSourceConfig.class);
//		
//		CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
//		findCustomerByEmail(dao);
//		context.close();
//	}
//
//	private static void findCustomerByEmail(CustomerDao dao) {
//		System.out.println("findCustomerByEmail: " 
//	+ dao.findCustomerByEmail("java@naver.com"));
//		
//	}
//}
