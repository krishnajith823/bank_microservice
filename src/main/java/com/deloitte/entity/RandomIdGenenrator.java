package com.deloitte.entity;

import java.io.Serializable;
import java.security.SecureRandom;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public abstract class RandomIdGenenrator implements IdentifierGenerator {
	
	private static final String randomId = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static final int length = 16; 

	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		return generateId();
	}
	
	private String generateId() {
		
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder(length);
		for(int i=0;i<length;i++) {
			int randomIndex = random.nextInt(randomId.length());
			char randomChar = randomId.charAt(randomIndex);
			sb.append(randomChar);
		}
		
		return sb.toString();
		
	}

}
