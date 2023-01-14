package com.example.ja6.service.impl;

import com.example.ja6.dao.AccoutDAO;
import com.example.ja6.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountImpl implements AccoutService {
    @Autowired
    AccoutDAO accDAO;

    @Override
    public Account findById(String username) {
        return accDAO.findById(username).get();
    }

    @Override
    public List<Account> findAll() {
        return accDAO.findAll();
    }
}
