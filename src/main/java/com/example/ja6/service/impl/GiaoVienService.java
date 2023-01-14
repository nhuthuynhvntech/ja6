package com.example.ja6.service.impl;
import com.example.ja6.entity.GiaoVien;
import com.example.ja6.entity.KhoaHoc;

import java.util.List;

public interface GiaoVienService {
    List<GiaoVien> findALl();
    GiaoVien create(GiaoVien giaoVien);
}
