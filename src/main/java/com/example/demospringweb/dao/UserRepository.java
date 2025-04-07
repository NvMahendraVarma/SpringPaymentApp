package com.example.demospringweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demospringweb.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{
	UserEntity findByUserNameAndPassword(String userName, String password);
}
