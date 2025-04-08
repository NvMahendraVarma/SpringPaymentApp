package com.example.demospringweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demospringweb.entity.UserAccountDetailsEntity;

@Repository
public interface UserAccountDetailsRepository extends JpaRepository<UserAccountDetailsEntity,Integer> {
	
}
