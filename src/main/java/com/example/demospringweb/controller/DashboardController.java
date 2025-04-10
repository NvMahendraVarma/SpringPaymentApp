package com.example.demospringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demospringweb.entity.UserEntity;

@Controller
public class DashboardController {
	@PostMapping("/logout")
	public String logout() {
			System.out.println("log out");
		return "login";
	}
	@PostMapping("/sendMoney")
	public String showSendMoneyPage() {
			System.out.println("send money");
		return "sendMoney";
	}
	@PostMapping("/addBankAccount")
	public String showAddBankAccountPage() {
			System.out.println("Add bank accont");
		return "addBankAccont";
	}
	@PostMapping("/detailedStatement")
	public String showdetailedStatement() {
			System.out.println("Detailed statement");
		return "statement";
	}
}
