package com.example.ja6.dao;

import com.example.ja6.entity.KhoaHoc;
import com.example.ja6.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KhoaHocDAO extends JpaRepository<KhoaHoc,Integer> {
@Query("SELECT p from KhoaHoc p where p.makhoa=?1")
    List<KhoaHoc> findCategoryid(String makhoa);
}
