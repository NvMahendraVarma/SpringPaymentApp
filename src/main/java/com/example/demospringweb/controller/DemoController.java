package com.example.demospringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	@GetMapping("/transaction")
	public String showHome() {
		System.out.println("home");
		return"Transactions";
	}
} 