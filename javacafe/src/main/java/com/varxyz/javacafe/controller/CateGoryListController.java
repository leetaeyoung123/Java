package com.varxyz.javacafe.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.javacafe.domain.Cafe;
import com.varxyz.javacafe.domain.Category;
import com.varxyz.javacafe.service.JavaCafeService;
import com.varxyz.javacafe.service.JavaCafeServiceImpl;

@Controller("controller.cateGoryList")
public class CateGoryListController {
	JavaCafeService service = new JavaCafeServiceImpl();
	@GetMapping("/select/highCate")
	public String selectHighCateForm(Model model) {
		model.addAttribute("cate", new Category());
		model.addAttribute("highCateSelect", service.selectHighCate());
		return "select/highCate";
	}
	
	@PostMapping("/select/highCate")
	public String selectHighCate(Category cate, Model model, HttpSession session) {
		System.out.println(model.addAttribute("highCateSelect", service.selectHighCate()));
		model.addAttribute("lowCate", service.selectLowCate(cate.getCategoryname()));
		session.setAttribute("lowCate", service.selectLowCate(cate.getCategoryname()));
		return "redirect:/select/lowCate";
	}
	
	@GetMapping("/select/lowCate")
	public String selectLowCateForm(Model model, HttpSession session) {
		session.getAttribute("lowCate");
		model.addAttribute("cafe", new Cafe());
		model.addAttribute("lowCateSelect",session.getAttribute("lowCate"));
		return "/select/lowCate";
	}

	@PostMapping("/select/lowCate")
	public String selectLowCate(Cafe cafe, Model model, HttpSession session) {
		model.addAttribute("menu", service.selectMenuList(cafe.getLowCateGory()));
		session.setAttribute("menu", service.selectMenuList(cafe.getLowCateGory()));
		return "redirect:/select/menu";
	}
	
	@GetMapping("/select/menu")
	public String selectMenuForm(Model model, HttpSession session) {
		List<Cafe> list = (List<Cafe>) session.getAttribute("menu");
		model.addAttribute("cafe", session.getAttribute("menu"));
		return "/select/menu";
	}
	
	@PostMapping("/select/menu")
	public String selectMenu(Cafe cafe, Model model, HttpSession session) {
		List<Cafe> list = (List<Cafe>) session.getAttribute("menu");
		model.addAttribute("menu", list.get(0));
		model.addAttribute("payment", cafe.getPrice() - list.get(0).getPrice());
		return "/select/result";
	}
}
