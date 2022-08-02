package com.varxyz.javacafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.varxyz.javacafe.domain.Cafe;
import com.varxyz.javacafe.service.JavaCafeService;
import com.varxyz.javacafe.service.JavaCafeServiceImpl;

@Controller("controller.addCafeController")
@RequestMapping("addCafe/addCafe")
public class AddCafeController {
	JavaCafeService service = new JavaCafeServiceImpl();
	
	@GetMapping
	public String addCafeForm(Model model) {
		System.out.println(1);
		model.addAttribute("cafe", new Cafe());
		System.out.println(service.selectAll());
		model.addAttribute("javacate", service.selectAll());
		return "addCafe/addCafe";
	}
	
	@PostMapping
	public String addCafe(Cafe cafe, Model model) {
		model.addAttribute("cafe", cafe);

		service.addCafe(cafe);
		JavaCafeService.context.close();
		return "addcafe/addCafeSuccess";
	}
}
