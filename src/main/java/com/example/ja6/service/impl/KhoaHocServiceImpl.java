package com.example.ja6.service.impl;

import com.example.ja6.dao.HocSinhDAO;
import com.example.ja6.dao.KhoaHocDAO;
import com.example.ja6.entity.KhoaHoc;
import com.example.ja6.entity.hocSinh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhoaHocServiceImpl implements KhoaHocService {
    @Autowired
    KhoaHocDAO hsDa0;


    @Override
    public List<KhoaHoc> findALl() {
        return hsDa0.findAll();
    }

    @Override
    public KhoaHoc create(KhoaHoc khoaHoc) {
     return hsDa0.save(khoaHoc);
    }
}
