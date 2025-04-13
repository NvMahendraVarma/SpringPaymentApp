package com.example.demospringweb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "banks_master")
public class BanksMasterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_id")
    private int bankId;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "ifsc_prefix")
    private String ifscPrefix;

    @Column(name = "country")
    private String country;

    
    
    
	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscPrefix() {
		return ifscPrefix;
	}

	public void setIfscPrefix(String ifscPrefix) {
		this.ifscPrefix = ifscPrefix;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

    
}
