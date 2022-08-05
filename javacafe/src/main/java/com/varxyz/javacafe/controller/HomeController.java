package com.varxyz.javacafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("controller.homeController")
public class HomeController {
	
	@GetMapping("/home")
	public String homeForm() {
		return "home";
	}
	
	@PostMapping("/home")
	public String home() {
		return "/select/highCate";
	}
}
