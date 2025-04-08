package com.example.demospringweb.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_account_details")
public class UserAccountDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "user_account_id")
	private int userAccountId;
	
	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
	private UserEntity userEntity;
	
	@Column(name = "account_open_date", nullable = false)
	private LocalDate accountOpenDate;
	
	public int getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public LocalDate getAccountOpenDate() {
		return accountOpenDate;
	}

	public void setAccountOpenDate(LocalDate accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public LocalDate getAccountCloseDate() {
		return accountCloseDate;
	}

	public void setAccountCloseDate(LocalDate accountCloseDate) {
		this.accountCloseDate = accountCloseDate;
	}

	public BigDecimal getCurrentWalletBalance() {
		return currentWalletBalance;
	}

	public void setCurrentWalletBalance(BigDecimal currentWalletBalance) {
		this.currentWalletBalance = currentWalletBalance;
	}

	public int getLinkedBankAccountsCount() {
		return linkedBankAccountsCount;
	}

	public void setLinkedBankAccountsCount(int linkedBankAccountsCount) {
		this.linkedBankAccountsCount = linkedBankAccountsCount;
	}

	public String getWalletPin() {
		return walletPin;
	}

	public void setWalletPin(String walletPin) {
		this.walletPin = walletPin;
	}

	@Column(name = "account_close_date")
	private LocalDate accountCloseDate;
	
	@Column(name = "current_wallet_balance", nullable = false)
	private BigDecimal currentWalletBalance = BigDecimal.ZERO; 
	
	@Column(name = "linked_bank_accounts_count", nullable = false)
	private int linkedBankAccountsCount = 0;  
	
	@Column(name = "wallet_pin", nullable = false)
	private String walletPin;
}
