package com.example.demospringweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demospringweb.dao.BankAccountRepository;
import com.example.demospringweb.dao.RealBankAccountRepository;
import com.example.demospringweb.dao.UserAccountDetailsRepository;
import com.example.demospringweb.dao.UserRepository;
import com.example.demospringweb.dto.BankAccountLinkRequest;
import com.example.demospringweb.entity.BankAccountsEntity;
import com.example.demospringweb.entity.RealBankAccountEntity;
import com.example.demospringweb.entity.UserAccountDetailsEntity;
import com.example.demospringweb.entity.UserEntity;

@Service
public class BankService {

    @Autowired
    private RealBankAccountRepository realBankAccountRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserAccountDetailsRepository userAccountRepo;

    @Autowired
    private BankAccountRepository bankAccountRepo;
    

    public String linkBankAccount(BankAccountLinkRequest request) {
        //Find user
        UserEntity user = userRepo.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        //Validate bank account and pin
        RealBankAccountEntity realAcc = realBankAccountRepo.findByAccountNumberAndIfscCode(request.getAccountNumber(), request.getIfscCode()).orElseThrow(() -> new RuntimeException("Bank account not found"));

        if (realAcc.isLinked()) return "This bank account is already linked.";
        if (!realAcc.getPinCode().equals(request.getPinCode())) return "Incorrect PIN.";

        //Get user account details
        UserAccountDetailsEntity userAccount = userAccountRepo.findByUserEntity(user)
                .orElseThrow(() -> new RuntimeException("User account details not found."));

        //Create linked account
        BankAccountsEntity bankAccount = new BankAccountsEntity();
        bankAccount.setUser(user);
        bankAccount.setUserAccountDetails(userAccount);
        bankAccount.setRealBankAccount(realAcc);
        bankAccount.setAccountStatus("ACTIVE");
        bankAccountRepo.save(bankAccount);

        // Mark as linked
        realAcc.setLinked(true);
        realBankAccountRepo.save(realAcc);

        // Update wallet's linked account count
        userAccount.setLinkedBankAccountsCount(userAccount.getLinkedBankAccountsCount() + 1);
        userAccountRepo.save(userAccount);

        return "Bank account linked successfully!";
    }
}

