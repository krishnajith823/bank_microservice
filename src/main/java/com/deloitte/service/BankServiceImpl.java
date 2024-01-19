package com.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.entity.Bank;
import com.deloitte.repository.BankRepository;

import jakarta.transaction.Transactional;

@Service
public class BankServiceImpl implements BankService{

	@Autowired
	BankRepository bankRepository;
	@Override
	public Bank createAccount(Bank bank) {
		// TODO Auto-generated method stub
		return bankRepository.save(bank);
	}

	@Override
	public Bank updateAccount(Bank bank) {
		// TODO Auto-generated method stub
		return bankRepository.save(bank);
	}

	@Override
	public List<Bank> viewAllAccounts() {
		// TODO Auto-generated method stub
		return bankRepository.findAll();
	}

	@Override
	public Bank findByAccountNo(String accountNo) {
		// TODO Auto-generated method stub
		return bankRepository.findById(accountNo).orElse(null);
	}

	@Transactional
	public Bank deleteAccount(String accountNo) {
		// TODO Auto-generated method stub
		bankRepository.deleteById(accountNo);
		return null;
	}

}
