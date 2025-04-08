package com.example.demospringweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demospringweb.entity.UserEntity;
import com.example.demospringweb.services.UserService;

@Controller
public class UserRegistrationController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/registration")
	public String showRegistrationPage() {
		System.out.println("registration");
		return "registration";
	}
	
	@PostMapping("/registerUser")
	public String registerUser (@RequestParam String username,
								@RequestParam String password,
								@RequestParam String firstName,
					            @RequestParam String lastName,
					            @RequestParam String phone,
					            @RequestParam String email,
					            @RequestParam String address) {
		
	    UserEntity userEntity = new UserEntity();
        userEntity.setUserName(username);
        userEntity.setPassword(password);
        userEntity.setFirstName(firstName);
        userEntity.setLastName(lastName);
        userEntity.setPhone(phone);
        userEntity.setEmail(email);
        userEntity.setAddress(address);
        
		userService.register(userEntity);
	    return "login";
	}
}




