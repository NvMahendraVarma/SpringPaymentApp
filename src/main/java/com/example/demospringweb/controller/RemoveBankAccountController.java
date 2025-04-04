package com.example.demospringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RemoveBankAccountController {
	@GetMapping("/removeBankAccount")
	public String removeBankAccountPage() {
		System.out.println("add bank Account");
		return "removeBankAccount";
	}
}

