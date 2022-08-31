package com.varxyz.javacafe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.varxyz.javacafe.domain.Category;
import com.varxyz.javacafe.service.JavaCafeService;
import com.varxyz.javacafe.service.JavaCafeServiceImpl;

@Controller("controller.addCateGoryController")
@RequestMapping("/addCafe/addCategory")
public class AddCateGoryController {
	
	@GetMapping
	public String addCateGoryForm(Model model) {
		model.addAttribute("cate", new Category());
		return "addCafe/addCategory";
	}
	
	@PostMapping
	public String addCateGory(Category cate, Model model) {
		JavaCafeService service = new JavaCafeServiceImpl();
		model.addAttribute("cate", cate);
		System.out.println(service.findHighCate(cate.getCategoryname()));
		if(cate.getCategoryname().equals(service.findHighCate(cate.getCategoryname()))) {
			model.addAttribute("msg", "중복된 카테고리입니다.");
			return "error";
		}
		service.addCate(cate);
		JavaCafeService.context.close();
		return "addCafe/addCategorySuccess";
	}
}
