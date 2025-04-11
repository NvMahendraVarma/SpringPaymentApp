package com.example.demospringweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demospringweb.dao.UserAccountDetailsRepository;
import com.example.demospringweb.dao.UserRepository;
import com.example.demospringweb.entity.UserAccountDetailsEntity;
import com.example.demospringweb.entity.UserEntity;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserAccountDetailsRepository userAccRepo;
	
	
	
	public void register(UserEntity userEntity, UserAccountDetailsEntity userAccountDetailsEntity ) {
		 System.out.println("Registering user: " + userEntity.getUserName());
		 
		 userRepo.save(userEntity);
		 userAccRepo.save(userAccountDetailsEntity);
		 
	}
	

	
    public boolean login(String username, String password) {
        System.out.println("Logging in user: " + username);
        return true;
    }
    
    
}




