package com.example.ja6.dao;

import com.example.ja6.entity.Product;
import com.example.ja6.entity.hocSinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HocSinhDAO extends JpaRepository<hocSinh,Integer> {
    @Query("SELECT p from hocSinh p where p.maHocSinh=?1")
    List<hocSinh> timhocsinh(String maHocSinh);
}
