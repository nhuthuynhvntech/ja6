package com.example.ja6.controller;

import com.example.ja6.entity.Account;
import com.example.ja6.entity.Authority;
import com.example.ja6.service.impl.AuthoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/autho")
public class restAutho {
@Autowired
    AuthoService authoService;
    @GetMapping
    public List<Authority> getAcc(){

        return authoService.findAll();
    }
    @PostMapping
    public Authority post(@RequestBody Authority auth){
        return authoService.create(auth);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
         authoService.delete(id);
    }
}
