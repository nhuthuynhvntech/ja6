package com.example.ja6.controller;


import com.example.ja6.dao.lopDao;
import com.example.ja6.entity.chonLop;
import com.example.ja6.entity.hocSinh;
import com.example.ja6.service.impl.hsse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/lop")
public class lopapi {





    @Autowired
    lopDao dao;


    @GetMapping()
    public List<chonLop> getAll(){
        return dao.findAll();
    }
    @GetMapping("{id}")
    public List<chonLop> timtheoten(@PathVariable("id") String maHocSinh){
        return dao.timlop(maHocSinh) ;
    }

    @PostMapping()
    public chonLop create(@RequestBody chonLop chonLop){
        return dao.save(chonLop);
    }
}
