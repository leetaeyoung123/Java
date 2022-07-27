package com.varxyz.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking.Service.AccountService;
import com.varxyz.banking.Service.AccountServiceImpl;

@Controller("controller.sendAccountController")
public class SendAccountController {
	
	@GetMapping("/sendAccount/sendAccount")
	public String sendAccount() {
		return "sendAccount/sendAccount";
	}
	
	@PostMapping("/sendAccount/sendAccount")
	public String sendAccount(double balance, String accountNum, Model model) {
		AccountService service = new AccountServiceImpl();
		service.sendAccount(balance, accountNum);
		model.addAttribute("account", balance);
		AccountService.context.close();
		return "sendAccount/sendAccountSuccess";
	}
}
