package com.example.ja6.service.impl;

import com.example.ja6.dao.AuthoDAO;
import com.example.ja6.entity.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthoImpl implements AuthoService{
    @Autowired
    AuthoDAO authoDAO;

    @Override
    public List<Authority> findAll() {
        return authoDAO.findAll();
    }

    @Override
    public Authority create(Authority auth) {
        return authoDAO.save(auth);
    }

    @Override
    public void delete(Integer id) {
        authoDAO.deleteById(id);

    }
}
