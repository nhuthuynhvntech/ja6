package com.example.ja6.dao;

import com.example.ja6.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDAO extends JpaRepository<Order,Long> {
    @Query("select o from Order o where o.account.username=?1")
    List<Order> findByUserName(String username);
}
