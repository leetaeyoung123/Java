package com.varxyz.javacafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.varxyz.javacafe.domain.Root;
import com.varxyz.javacafe.service.JavaCafeService;
import com.varxyz.javacafe.service.JavaCafeServiceImpl;

@Controller("controller.root")
public class RootController {
	JavaCafeService service = new JavaCafeServiceImpl();
	
	@GetMapping("/root/login")
	public String loginForm() {
		return "root/login";
	}
	
	@PostMapping("/root/login")
	public String login(Root root, Model model, HttpServletRequest request) {
		Root login = service.login(request.getParameter("rootId"));
		if(request.getParameter("rootId") == null || request.getParameter("rootId") == "" || request.getParameter("rootId").length() == 0
				|| request.getParameter("rootPw") == null ||request.getParameter("rootPw") == "") {
			model.addAttribute("msg","아이디 비밀번호를 입력해주세요");
			return "error";		
		}
		
		if(!request.getParameter("rootId").equals(login.getRootId()) 
				|| !request.getParameter("rootPw").equals(login.getRootPw())) {
			model.addAttribute("msg","아이디 비밀번호를 확인해주세요");
			return "error";		
		}
		return "redirect: /javacafe/root/allfind";
	}
	
	@GetMapping("/root/allfind")
	public String allForm(Model model) {
		//System.out.println(service.findAllMenu());
		//model.addAttribute("menuAll",service.findAllMenu());
		return "root/allfind";
	}
	
	@GetMapping("/root/update")
	public String updateForm(Model model) {
		model.addAttribute("menuAll",service.findAllMenu());
		return "root/update";
	}
}

