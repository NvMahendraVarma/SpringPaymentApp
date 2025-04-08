package com.example.demospringweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demospringweb.dao.BankAccountRepository;

@Service
public class BankService {
	@Autowired
	private BankAccountRepository bankAccRepo;
	public List getBankAcc() {
		return bankAccRepo.findAll();
	}
}
