package com.example.demospringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserDetailsController {

	@GetMapping("/userDetails")
	public String showProfilePage() {
		System.out.println("user details");
		return "profile";
	}
}