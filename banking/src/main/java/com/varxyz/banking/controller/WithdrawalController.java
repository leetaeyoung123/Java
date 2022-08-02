package com.varxyz.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking.Service.AccountService;
import com.varxyz.banking.Service.AccountServiceImpl;

@Controller("controller.withdrawalController")
public class WithdrawalController {
	
	@GetMapping("/withdrawal/withdrawal")
	public String withdrawal() {
		return "withdrawal/withdrawal";
	}
	
	@PostMapping("/withdrawal/withdrawal")
	public String withdrawal(double balance, String accountNum, Model model) {
		AccountService service = new AccountServiceImpl();
		service.withdrawal(balance, accountNum);
		model.addAttribute("account", balance);
		AccountService.context.close();
		return "withdrawal/withdrawalSuccess";
	}
}
