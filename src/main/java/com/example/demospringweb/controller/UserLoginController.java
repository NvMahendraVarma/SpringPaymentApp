package com.example.demospringweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demospringweb.dao.UserRepository;
import com.example.demospringweb.entity.UserEntity;

@Controller
public class UserLoginController {
	
	@Autowired
    private UserRepository userRepository;
	 
	@RequestMapping("/login")
	public String showLoginPage() {
		System.out.println("login");
		return "login";
	}
	
	@PostMapping("/loginForm")
    public String authenticateUser(@RequestParam("user_name") String userName,
                                   @RequestParam("password") String password,
                                   Model model) {
        UserEntity user = userRepository.findByUserName(userName);
        if (user != null && user.getPassword().equals(password)) {
            return "dashBoard"; 
        } else {
            model.addAttribute("errorMessage", "Invalid Username or Password");
            return "login"; 
        }
    }
}