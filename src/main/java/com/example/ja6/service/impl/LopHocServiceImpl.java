package com.example.ja6.service.impl;

import com.example.ja6.dao.HocSinhDAO;
import com.example.ja6.dao.LopHocDAO;
import com.example.ja6.entity.LopHoc;
import com.example.ja6.entity.hocSinh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LopHocServiceImpl implements LopHocService {
    @Autowired
    LopHocDAO lhDao;


    @Override
    public List<LopHoc> findALl() {
        return lhDao.findAll();
    }

    @Override
    public LopHoc create(LopHoc lopHoc) {
     return lhDao.save(lopHoc);
    }
}
