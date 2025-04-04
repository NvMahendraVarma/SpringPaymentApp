package com.example.demospringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddBankAccountController {
	@GetMapping("/addBankAccont")
	public String addBankAccountPage() {
		System.out.println("add bank Account");
		return "addBankAccont";
	}
}
