package com.example.ja6.controller;


import com.example.ja6.dao.HocSinhDAO;
import com.example.ja6.entity.Product;
import com.example.ja6.entity.hocSinh;

import com.example.ja6.service.impl.hsse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/hs")
public class hsapi {




    @Autowired
    hsse hs;
    @Autowired
    HocSinhDAO dao;


    @GetMapping()
    public List<hocSinh> getAll(){
        return hs.findALl();
    }
    @GetMapping("{id}")
    public List<hocSinh> timtheoten(@PathVariable("id") String maHocSinh){
        return dao.timhocsinh(maHocSinh);
    }

    @PostMapping()
    public hocSinh create(@RequestBody hocSinh hocSinh){
        return hs.create(hocSinh);
    }


}
