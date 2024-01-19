package com.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.entity.Bank;
import com.deloitte.service.BankService;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	BankService bankService;
	
	@GetMapping("/accounts")
	public ResponseEntity<List<Bank>> viewAll(){
		List<Bank>  account  = bankService.viewAllAccounts();
		if(account==null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	
		return ResponseEntity.status(HttpStatus.OK).body(account);
			
		}
	
	@PostMapping("/accounts/create")
	public ResponseEntity<Bank> createAccount(@RequestBody Bank bank) {
		
		Bank bank1= bankService.createAccount(bank);
		if(bank1==null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
			return ResponseEntity.status(HttpStatus.OK).body(bank1);
			
		}
	
	@PostMapping("/accounts/update")
	public ResponseEntity<Bank> updateAccount(@RequestBody Bank bank) {
		
		Bank bank1= bankService.updateAccount(bank);
		if(bank1==null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
			return ResponseEntity.status(HttpStatus.OK).body(bank1);
			
		}
	
	
	
	@DeleteMapping("/accounts/{accountNo}/delete")
	public ResponseEntity<String> deleteAccount(@PathVariable String accountNo){
		try {
			bankService.deleteAccount(accountNo);
			return new ResponseEntity<>("Account Deleted Successfully !", HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>("Error, Cannot Delete Account !" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/accounts/{accountNo}")
	public ResponseEntity<Bank> searchByAccountNo(@PathVariable String accountNo) {
		
		Bank bank= bankService.findByAccountNo(accountNo);
		if(bank==null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	
		return ResponseEntity.status(HttpStatus.OK).body(bank);
			
		}

}
