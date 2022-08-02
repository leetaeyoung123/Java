package com.varxyz.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking.Service.AccountService;
import com.varxyz.banking.Service.AccountServiceImpl;

@Controller("controller.depositController")
public class DepositController {

	@GetMapping("/deposit/deposit")
	public String depositForm() {
		return "deposit/deposit";
	}
	
	@PostMapping("/deposit/deposit")
	public String deposit(double balance, String accountNum, Model model) {
		AccountService service = new AccountServiceImpl();
		service.deposit(balance, accountNum);
		model.addAttribute("account", balance);
		AccountService.context.close();
		return "deposit/depositSuccess";
	}
}
