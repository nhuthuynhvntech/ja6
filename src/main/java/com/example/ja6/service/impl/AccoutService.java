package com.example.ja6.service.impl;

import com.example.ja6.entity.Account;

import java.util.List;

public interface AccoutService {
    Account findById(String username);


    List<Account> findAll();
}
