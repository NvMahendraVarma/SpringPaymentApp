package com.example.demospringweb.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demospringweb.entity.UserAccountDetailsEntity;
import com.example.demospringweb.entity.UserEntity;

@Repository
public interface UserAccountDetailsRepository extends JpaRepository<UserAccountDetailsEntity, Integer> {
    Optional<UserAccountDetailsEntity> findByUserEntity(UserEntity user);
}
