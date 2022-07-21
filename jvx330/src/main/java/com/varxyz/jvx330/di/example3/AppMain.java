package com.varxyz.jvx330.di.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		// Xml사용 방식
		//String config = "com/varxyz/jvx330/di/example3/beans.xml";
		
		//class사용 방식
		GenericApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MemberService memberService = context.getBean("memberService", MemberService.class);
		memberService.getAllMembers().forEach(member -> System.out.println(member));
		/*List<Member> list = memberService.getAllMembers();
		 * for(Member member : list){
		 * 	System.out.println(member);
		 * }
		 * */
		context.close();
	}
}
