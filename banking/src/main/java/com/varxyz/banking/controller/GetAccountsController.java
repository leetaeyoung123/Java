package com.varxyz.banking.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.varxyz.banking.Service.AccountService;
import com.varxyz.banking.Service.AccountServiceImpl;
import com.varxyz.banking.domain.Account;

@Controller("controller.getAccountsController")
public class GetAccountsController {
		
	@GetMapping("/getAccounts/getAccounts")
	public String getAccountsForm() {
		return "getAccounts/getAccounts";
	}
	
	@PostMapping("/getAccounts/getAccounts")
	public String getAccounts(@RequestParam String customerId, Model model) {	
		AccountService service = new AccountServiceImpl();
		List<Account> account = service.getAccounts(customerId);
		model.addAttribute("account", account);
		AccountService.context.close();
		return "getAccounts/getAccountsSuccess";
	}
}
