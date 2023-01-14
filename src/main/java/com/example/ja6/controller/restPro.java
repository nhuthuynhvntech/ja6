package com.example.ja6.controller;

import com.example.ja6.entity.Product;
import com.example.ja6.service.impl.ProducService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/products")
public class restPro {
    @Autowired
    ProducService producService;
    @GetMapping()
    public List< Product >getAll(){
        return producService.findALl();
    }
    @PostMapping()
    public Product create(@RequestBody Product product){
        return producService.create(product);
    }
    @PutMapping("{id}")
    public Product update(@RequestBody Product product,@PathVariable("id") Integer id){
        return producService.update(product);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        producService.delete(id);
    }
}
