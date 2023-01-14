package com.example.ja6.controller;


import com.example.ja6.dao.HocSinhDAO;
import com.example.ja6.dao.lopDao;
import com.example.ja6.entity.Product;
import com.example.ja6.entity.chonLop;
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

    @Autowired
    lopDao lopdao;


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
        hocSinh.setStatus(true);
        return hs.create(hocSinh);
    }

    @PostMapping("lophocsinh/{mahs}")
    public List<chonLop> lophoc(@PathVariable String mahs){
        return lopdao.timlop(mahs);
    }

    @PostMapping("update")
    public void lophoc(@RequestBody hocSinh sinhsinh){
        dao.save(sinhsinh);
    }

    @PostMapping("delete")
    public void delete(@RequestBody hocSinh sinhsinh){
        sinhsinh.setStatus(false);
        dao.save(sinhsinh);
    }



}
