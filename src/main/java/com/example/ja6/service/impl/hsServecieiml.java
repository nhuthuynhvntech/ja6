package com.example.ja6.service.impl;

import com.example.ja6.dao.HocSinhDAO;
import com.example.ja6.entity.hocSinh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class hsServecieiml implements hsse {
    @Autowired
    HocSinhDAO hsDa0;


    @Override
    public List<hocSinh> findALl() {
        return hsDa0.findAll();
    }

    @Override
    public hocSinh create(hocSinh hocSinh) {
     return    hsDa0.save(hocSinh);
    }
}
