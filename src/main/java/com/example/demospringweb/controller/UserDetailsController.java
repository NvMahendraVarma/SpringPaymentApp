package com.example.demospringweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demospringweb.entity.TransactionEntity;
import com.example.demospringweb.services.TransactionService;
import com.example.demospringweb.services.UserService;

@Controller
public class UserDetailsController {
	
	@Autowired 
	private UserService userService;
	
	@GetMapping("/userDetails")
	public String showProfilePage() {
		System.out.println("user details");
		return "profile";
	}
}


