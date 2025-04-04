package com.example.demospringweb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details")
public class UserEntity {
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private int userName;
	
	@Column(name="pass_word")
	private int password;
	
	@Column(name="first_name")
	private int firstName;
	
	@Column(name="last_name")
	private int lastName;
	
	@Column(name="phone")
	private int phone;
	
	@Column(name="email")
	private int email;
	
	@Column(name="address")
	private int address;

}
