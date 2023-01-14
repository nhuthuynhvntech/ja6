package com.example.ja6.dao;

import com.example.ja6.entity.GiaoVien;
import com.example.ja6.entity.hocSinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GiaoVienDAO extends JpaRepository<GiaoVien,Integer> {
    @Query("SELECT p from GiaoVien p where p.maGiaoVien=?1")
    List<hocSinh> timgiaovien(String maGiaoVien);
}
