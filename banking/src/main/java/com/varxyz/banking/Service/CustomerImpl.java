package com.varxyz.banking.Service;

import com.varxyz.banking.domain.Customer;

public class CustomerImpl implements CustomerService{

	@Override
	public void addCustomer(Customer customer) {
		dao.addCustomer(customer);
	}

}
