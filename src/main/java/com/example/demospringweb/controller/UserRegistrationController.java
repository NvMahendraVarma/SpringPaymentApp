package com.example.demospringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserRegistrationController {

	@GetMapping("/registration")
	public String showRegistrationPage() {
		System.out.println("registration");
		return "registration";
	}
}
