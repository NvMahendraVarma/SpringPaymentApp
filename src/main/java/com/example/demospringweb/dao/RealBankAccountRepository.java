package com.example.demospringweb.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demospringweb.entity.RealBankAccountEntity;

@Repository
public interface RealBankAccountRepository extends JpaRepository<RealBankAccountEntity, Integer> {
    Optional<RealBankAccountEntity> findByAccountNumberAndIfscCode(String accountNumber, String ifscCode);
}
