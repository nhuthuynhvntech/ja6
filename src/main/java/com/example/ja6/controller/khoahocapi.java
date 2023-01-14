package com.example.ja6.controller;


import com.example.ja6.dao.KhoaHocDAO;
import com.example.ja6.dao.lopDao;
import com.example.ja6.entity.KhoaHoc;
import com.example.ja6.entity.chonLop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/kh")
public class khoahocapi {





    @Autowired
    KhoaHocDAO dao;


    @GetMapping()
    public List<KhoaHoc> getAll(){
        return dao.findAll();
    }
    @GetMapping("{id}")
    public List<KhoaHoc> timtheoten(@PathVariable("id") String makhoa){
        return dao.findCategoryid(makhoa) ;
    }
}
