package com.example.demospringweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demospringweb.dto.BankAccountLinkRequest;
import com.example.demospringweb.entity.UserEntity;
import com.example.demospringweb.services.BankService;
import com.example.demospringweb.services.UserService;

@Controller
public class BankController {
    
    @Autowired
    private BankService bankService;
    
    @Autowired
    private UserService userService;

    @PostMapping("/link")
    public String linkBankAccount(
        @RequestParam String accountNumber,
        @RequestParam String ifscCode,
        @RequestParam String pinCode, 
        Model model) {
        
        try {
            //Get current authenticated user
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            String currentUsername = authentication.getName();
            
            //Find user entity
            UserEntity currentUser = userService.findByUsername(currentUsername);
            if (currentUser == null) {
                throw new RuntimeException("User not found");
            }
            
            //Create and validate request
            BankAccountLinkRequest request = new BankAccountLinkRequest();
            request.setUserId(currentUser.getUserId());
            request.setAccountNumber(accountNumber);
            request.setIfscCode(ifscCode);
            request.setPinCode(pinCode);
            
            //Process linking
            String result = bankService.linkBankAccount(request);
            model.addAttribute("message", result);
            model.addAttribute("messageType", "alert-success");
            
        } catch (Exception e) {
            model.addAttribute("message", e.getMessage());
            model.addAttribute("messageType", "alert-danger");
        }
        
        return "addBankAccount";
    }
}