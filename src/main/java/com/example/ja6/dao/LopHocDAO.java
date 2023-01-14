package com.example.ja6.dao;

import com.example.ja6.entity.LopHoc;
import com.example.ja6.entity.hocSinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LopHocDAO extends JpaRepository<LopHoc,Integer> {
    @Query("SELECT p from LopHoc p where p.malop=?1")
    List<LopHoc> timLop(String maLop);
}
