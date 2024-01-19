package com.deloitte.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name="bank_table")
public class Bank {
	@TableGenerator(
			name="acc_no_gen",
			table = "tbl_acc_no",
			pkColumnName = "accNo",
			pkColumnValue = "acc",
			valueColumnName = "acc_value",
			allocationSize = 1)
	@Id
	@GenericGenerator(name = "random_id_generator",strategy = "com.deloitte.RandomIdGenenrator")
	private String accountNo;
	private long bankId;
	private String bankType;
	private String accountType;
	private String accountOwnerType;
	private String firstName;
	private String middleName;
	private String lastName;
	private String suffix;
	private boolean primaryBank;
	private String status;
	private String authenticationMethod;
	private String transactionType;
	private String communicationChannel;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountOwnerType() {
		return accountOwnerType;
	}
	public void setAccountOwnerType(String accountOwnerType) {
		this.accountOwnerType = accountOwnerType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public boolean isPrimaryBank() {
		return primaryBank;
	}
	public void setPrimaryBank(boolean primaryBank) {
		this.primaryBank = primaryBank;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAuthenticationMethod() {
		return authenticationMethod;
	}
	public void setAuthenticationMethod(String authenticationMethod) {
		this.authenticationMethod = authenticationMethod;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getCommunicationChannel() {
		return communicationChannel;
	}
	public void setCommunicationChannel(String communicationChannel) {
		this.communicationChannel = communicationChannel;
	}
	
	
	

}
