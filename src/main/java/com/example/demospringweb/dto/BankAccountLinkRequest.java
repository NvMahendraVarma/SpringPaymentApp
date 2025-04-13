package com.example.demospringweb.dto;

public class BankAccountLinkRequest {
	private int userId;
    private String accountNumber;
    private String ifscCode;
    private String pinNumber;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getPinCode() {
		return pinNumber;
	}
	public void setPinCode(String pinCode) {
		this.pinNumber = pinCode;
	}
    
    
}
