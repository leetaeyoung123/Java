package com.varxyz.banking.domain;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c = new Customer();	// 정보를 저장하기 위한 Customer 객체 생성
		
		c.setName("이성호");	// Customer 객체에 이름 및 주민번호 저장
		c.setSsn("930418");
		c.setPhone("010-2503-4372");
		c.setCustomerId("LeeSeongHo");
		c.setPasswd("1234");
		
		Account a = new Account();
		AccountServiceImpl.getInstance().addAccount(a);
		System.out.println(a);
//		CustomerService c1 = new CustomerServiceImpl();	
		// interface는 객체를 만들지 못하므로 다형성을 이용하여 객체 "구현"
		
//		c1.addCustomer(c);	// CustomerServiceTmpl에 Customer c에 담겨져 있는 정보를 전달
//		c1.getCustomerByssn("1234");	// CustomerServiceTmpl 안에 있는 메소드 호출
		
		CustomerService c2 = new CustomerServiceImpl2();
		c2.addCustomer(c);
		c2.getCustomerByssn("930418");
	}
}
