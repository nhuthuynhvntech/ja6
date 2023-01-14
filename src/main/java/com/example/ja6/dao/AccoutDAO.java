package com.example.ja6.dao;

import com.example.ja6.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccoutDAO extends JpaRepository<Account,String> {
}
