package com.varxyz.banking.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking.Service.AccountService;
import com.varxyz.banking.Service.AccountServiceImpl;
import com.varxyz.banking.domain.Account;

@Controller("controller.getBalanceController")
public class GetBalanceController {

	@GetMapping("/getBalance/getBalance")
	public String balanceAccountForm() {
		return "getBalance/getBalance";
	}
	
	@PostMapping("/getBalance/getBalance")
	public String balanceAccount(String accountNum, Model model) {
		AccountService service = new AccountServiceImpl();
		List<Account> account = service.getBalance(accountNum);
		model.addAttribute("account",account);
		AccountService.context.close();
		return "getBalance/getBalanceSuccess";
	}
}
