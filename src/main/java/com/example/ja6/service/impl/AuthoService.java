package com.example.ja6.service.impl;

import com.example.ja6.entity.Authority;
import com.example.ja6.entity.Role;

import java.util.List;

public interface AuthoService {
    List<Authority> findAll();

    Authority create(Authority auth);

    void delete(Integer id);
}
