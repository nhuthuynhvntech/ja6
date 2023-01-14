package com.example.ja6.dao;

import com.example.ja6.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthoDAO extends JpaRepository<Authority,Integer> {
}
