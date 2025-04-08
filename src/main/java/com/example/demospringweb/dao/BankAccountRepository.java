package com.example.demospringweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demospringweb.entity.BankAccountsEntity;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccountsEntity,Integer>{

}
