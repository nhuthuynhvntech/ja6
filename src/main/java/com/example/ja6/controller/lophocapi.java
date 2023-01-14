package com.example.ja6.controller;


import com.example.ja6.dao.HocSinhDAO;
import com.example.ja6.dao.LopHocDAO;
import com.example.ja6.entity.LopHoc;
import com.example.ja6.entity.hocSinh;
import com.example.ja6.service.impl.LopHocService;
import com.example.ja6.service.impl.hsse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/lophoc")
public class lophocapi {




    @Autowired
    LopHocService lopHocService;
    @Autowired
    LopHocDAO lopHocDAO;


    @GetMapping()
    public List<LopHoc> getAll(){
        return lopHocService.findALl();
    }

    @GetMapping("{id}")
    public List<LopHoc> timtheoten(@PathVariable("id") String maLop){
        return lopHocDAO.timLop(maLop);
    }


    @PostMapping("one")
    public LopHoc create(@RequestBody LopHoc lopHoc){
        return lopHocService.create(lopHoc);
    }


}
