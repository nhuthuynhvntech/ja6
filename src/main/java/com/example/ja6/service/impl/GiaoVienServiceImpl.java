package com.example.ja6.service.impl;

import com.example.ja6.dao.GiaoVienDAO;
import com.example.ja6.dao.LopHocDAO;
import com.example.ja6.entity.GiaoVien;
import com.example.ja6.entity.LopHoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiaoVienServiceImpl implements GiaoVienService{
    @Autowired
    GiaoVienDAO gvDao;


    @Override
    public List<GiaoVien> findALl() {
        return gvDao.findAll();
    }

    @Override
    public GiaoVien create(GiaoVien giaoVien) {
     return gvDao.save(giaoVien);
    }
}
