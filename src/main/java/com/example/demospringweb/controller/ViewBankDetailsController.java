package com.example.demospringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewBankDetailsController {
	@GetMapping("/viewBankDetails")
	public String showBankDetailsPage() {
			System.out.println("bankDetails");
		return "bankDetails";
	}
}
