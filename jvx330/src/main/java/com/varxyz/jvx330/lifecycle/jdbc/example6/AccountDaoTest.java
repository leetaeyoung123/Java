package com.varxyz.jvx330.lifecycle.jdbc.example6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class AccountDaoTest {
	static private AccountDao dao;
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Example6Config.class);
		
		dao = context.getBean("accountDao", AccountDao.class);
		//----------------------------------------------------------------
		findAll();
		context.close();
	}
	public static void findAll() {
		System.out.println("findAllaccount called");
		Pageable pageable = PageRequest.of(0, 5, Sort.Direction.DESC, "regDate");
		dao.findAll(pageable).forEach(c -> System.out.println(c));
	}
	
}
