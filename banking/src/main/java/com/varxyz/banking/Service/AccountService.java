package com.varxyz.banking.Service;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.banking.dao.AccountDao;
import com.varxyz.banking.data.DataSourceConfig;
import com.varxyz.banking.domain.Account;

public interface AccountService {
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DataSourceConfig.class);

	AccountDao dao = context.getBean("accountDao", AccountDao.class);
	
	public void addAccount(Account account);
	public List<Account> getAccounts(String customerId);
	public List<Account> getBalance(String accountNum);
	public double withdrawal(double balance, String accountNum);
	public double deposit(double balance, String accountNum);
	public boolean transfer(double amount, String sendAccount, String getAccount);
}
