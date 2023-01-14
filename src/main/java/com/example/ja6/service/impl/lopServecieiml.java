package com.example.ja6.service.impl;

import com.example.ja6.dao.lopDao;
import com.example.ja6.entity.chonLop;
import com.example.ja6.entity.hocSinh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class lopServecieiml implements lopse{
    @Autowired
    lopDao lopDao;


    @Override
    public List<chonLop> findALl() {
        return lopDao.findAll();
    }
}
