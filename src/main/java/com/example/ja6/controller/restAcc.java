package com.example.ja6.controller;

import com.example.ja6.entity.Account;
import com.example.ja6.service.impl.AccoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/acc")
public class restAcc {
    @Autowired
    AccoutService accoutService;
    @GetMapping
    public List<Account> getAcc(){
        return accoutService.findAll();
    }
}
