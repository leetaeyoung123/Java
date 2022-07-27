package com.varxyz.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking.Service.CustomerImpl;
import com.varxyz.banking.Service.CustomerService;
import com.varxyz.banking.domain.Customer;


@Controller("controller.addCustomerController")
public class AddCustomerController {

	@GetMapping("/addCustomer/addCustomer")
	public String addCustomerForm() {
		return "addCustomer/addCustomer";
	}
	
	@PostMapping("/addCustomer/addCustomer")
	public String addCustomer(Customer customer, Model model) {
		CustomerService service = new CustomerImpl();
		model.addAttribute("customer", customer);
		
		service.addCustomer(customer);
		CustomerService.context.close();
		
		return "addCustomer/addCustomerSuccess";
	}
}
