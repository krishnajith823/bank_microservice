package com.deloitte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, String>{
	
	
	

}
