package com.example.ja6.controller;

import com.example.ja6.entity.Account;
import com.example.ja6.entity.Role;
import com.example.ja6.service.impl.AccoutService;
import com.example.ja6.service.impl.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/role")
public class restRole {
    @Autowired
    RoleService roleService;
    @GetMapping
    public List<Role> getRo(){
        return roleService.findAll();
    }
}
