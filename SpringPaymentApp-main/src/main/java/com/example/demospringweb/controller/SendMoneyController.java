package com.example.demospringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SendMoneyController {
	@GetMapping("/sendMoney")
	public String showSendMoneyPage() {
		System.out.println("sendMoney");
		return "sendMoney";
	}
}
