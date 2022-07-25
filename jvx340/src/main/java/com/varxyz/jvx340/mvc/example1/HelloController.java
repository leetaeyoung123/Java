package com.varxyz.jvx340.mvc.example1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/example1/sayHello")
	public ModelAndView sayHello() {
		String greeting = "몸무게가 22톤인 암컷 향고래가 500킬로그램에 달하는 대왕 오징어를 먹고 6시간 뒤에 1.3톤짜리 알을 낳았다면 이 암컷 향고래의 몸무게는 얼마일까요?";
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("example1/hello");
		mav.addObject("greeting", greeting);
		
		return mav;
	}
}
