package com.varxyz.banking.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking.Service.AccountService;
import com.varxyz.banking.Service.AccountServiceImpl;
import com.varxyz.banking.domain.Account;

@Controller("controller.balanceAccountController")
public class BalanceAccountController {

	@GetMapping("/balanceAccount/balanceAccount")
	public String balanceAccountForm() {
		return "balanceAccount/balanceAccount";
	}
	
	@PostMapping("/balanceAccount/balanceAccount")
	public String balanceAccount(String accountNum, Model model) {
		AccountService service = new AccountServiceImpl();
		List<Account> account = service.balanceAccount(accountNum);
		model.addAttribute("account",account);
		AccountService.context.close();
		return "balanceAccount/balanceAccountSuccess";
	}
}
