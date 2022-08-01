package com.varxyz.javacafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.varxyz.javacafe.domain.JavaCafeMenu;

@Controller("controller.javaCafeController")
public class JavaCafeController {

	@GetMapping
	public String javacafeForm(Model model) {
		model.addAttribute("javacafe", new JavaCafeMenu());
		return "javacafe/javacafe";
	}
}
