package com.deloitte.service;

import java.util.List;

import com.deloitte.entity.Bank;

public interface BankService {
	
	Bank createAccount(Bank bank);
	Bank updateAccount(Bank bank);
	List<Bank> viewAllAccounts();
	Bank findByAccountNo (String accountNo);
	Bank deleteAccount (String accountNo);
	

}
