package com.example.ja6.dao;

import com.example.ja6.entity.Order;
import com.example.ja6.entity.chonLop;
import com.example.ja6.entity.hocSinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface lopDao extends JpaRepository<chonLop,Integer> {
    @Query("SELECT p from chonLop p where p.maHocSinh=?1")
    List<chonLop> timlop(String maHocSinh);
}
