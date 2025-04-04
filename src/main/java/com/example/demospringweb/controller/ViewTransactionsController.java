package com.example.demospringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ViewTransactionsController {
		
		@GetMapping("/viewTransactions")
		public String showTransactons() {
				System.out.println("view transactions");
			return "statement";
		}
}
