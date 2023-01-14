package com.example.ja6.controller;

import com.example.ja6.dao.ProductDAO;
import com.example.ja6.entity.Product;
import com.example.ja6.service.impl.ProducService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@CrossOrigin("*")
@RestController
@RequestMapping("/rest/products")
public class rest {
    @Autowired
    ProducService producService;

    @GetMapping("{id}")
    public Product getOne(@PathVariable("id")Integer id){
    return producService.findById(id);

    }
}
