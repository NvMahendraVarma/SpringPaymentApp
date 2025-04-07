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
	
	@PostMapping("/welcome")
    public String authenticateUser(@RequestParam("username") String userName,
                                   @RequestParam("password") String password,
                                   Model model) {
        UserEntity user = userRepository.findByUserNameAndPassword(userName, password);

        if (user != null) {
            return "dashboard"; // Redirects to dashboard.html
        } else {
            model.addAttribute("errorMessage", "Invalid Username or Password");
            return "login"; // Return to login page with error
        }
    }
}