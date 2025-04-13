package com.example.demospringweb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bank_accounts")
public class BankAccountsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_account_id")
    private int bankAccountId;

    @ManyToOne
    @JoinColumn(name = "user_account_id", referencedColumnName = "user_account_id", nullable = false)
    private UserAccountDetailsEntity userAccountDetails;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private UserEntity user;

    @OneToOne
    @JoinColumn(name = "real_account_id", referencedColumnName = "real_account_id", nullable = false)
    private RealBankAccountEntity realBankAccount;

    @Column(name = "account_status", nullable = false)
    private String accountStatus; // ACTIVE, INACTIVE, FROZEN, CLOSED

    
    public int getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(int bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public UserAccountDetailsEntity getUserAccountDetails() {
        return userAccountDetails;
    }

    public void setUserAccountDetails(UserAccountDetailsEntity userAccountDetails) {
        this.userAccountDetails = userAccountDetails;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public RealBankAccountEntity getRealBankAccount() {
        return realBankAccount;
    }

    public void setRealBankAccount(RealBankAccountEntity realBankAccount) {
        this.realBankAccount = realBankAccount;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}
