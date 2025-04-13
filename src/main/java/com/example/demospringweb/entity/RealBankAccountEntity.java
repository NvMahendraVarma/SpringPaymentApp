package com.example.demospringweb.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "real_bank_accounts")
public class RealBankAccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "real_account_id")
    private int realAccountId;

    @Column(name = "account_holder_name", nullable = false)
    private String accountHolderName;

    @Column(name = "account_number", nullable = false, unique = true)
    private String accountNumber;

    @Column(name = "ifsc_code", nullable = false)
    private String ifscCode;

    @ManyToOne
    @JoinColumn(name = "bank_id", referencedColumnName = "bank_id", nullable = false)
    private BanksMasterEntity bank;

    @Column(name = "branch_location", nullable = false)
    private String branchLocation;

    @Column(name = "pin_code", nullable = false)
    private String pinCode;

    @Column(name = "is_linked", nullable = false)
    private boolean isLinked = false;

    
	@OneToOne(mappedBy = "realBankAccount") 
	private BankAccountsEntity bankAccount;
	
	
    public int getRealAccountId() {
        return realAccountId;
    }

    public void setRealAccountId(int realAccountId) {
        this.realAccountId = realAccountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
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

    public BanksMasterEntity getBank() {
        return bank;
    }

    public void setBank(BanksMasterEntity bank) {
        this.bank = bank;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public boolean isLinked() {
        return isLinked;
    }

    public void setLinked(boolean linked) {
        isLinked = linked;
    }
}
