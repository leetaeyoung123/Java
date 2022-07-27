package com.varxyz.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking.Service.AccountService;
import com.varxyz.banking.Service.AccountServiceImpl;
import com.varxyz.banking.domain.Account;

@Controller("controller.addAccountController")
public class AddAccountController {
	
	
	@GetMapping("/addAccount/addAccount")
	public String addAccountForm() {
		return "addAccount/addAccount";
	}
	
	@PostMapping("/addAccount/addAccount")
	public String addAccount(Account account, Model model) {
		AccountService service = new AccountServiceImpl();
		model.addAttribute("account", account);
		
		service.addAccount(account);
		AccountService.context.close();
		return "addAccount/addAccountSuccess";
	}
}
