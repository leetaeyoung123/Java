package com.varxyz.jvx330.lifecycle.mvc.example6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("example6.javaCafeController")
@RequestMapping("/example6/javaCafeCategory")
public class JavaCafeController {

	@GetMapping
	public String javaCafeMenuForm(Model model) {
		model.addAttribute("javaCafeCategory", new JavaCafeCategory());
		return "example6/javaCafeCategory";
	}

//	@ModelAttribute("javaCafeMenuCategory")
//	public List<String> getJavaCafeMenuCategory() {
//		List<String> categoryList = new ArrayList<String>();
//		categoryList.add("coffee");
//		categoryList.add("cake");
//		return categoryList;
//	}
//
//	@ModelAttribute("javaCafeMenuCoffee")
//	public List<JavaCafeMenuCoffee> getJavaCafeMenuCoffee() {
//		List<JavaCafeMenuCoffee> coffeeList = new ArrayList<JavaCafeMenuCoffee>();
//		coffeeList.add(new JavaCafeMenuCoffee("아메리카노", 4500));
//		return coffeeList;
//	}
	@PostMapping
	public String javaCafeMenu(@ModelAttribute("javaCafeCategory")
								JavaCafeCategory javaCafeCategory, Model model) {
		model.addAttribute("javaCafeCategory", javaCafeCategory);
		return "example6/javaCafeCategory";
	}
}
