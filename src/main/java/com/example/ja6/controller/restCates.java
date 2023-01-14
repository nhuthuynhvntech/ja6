package com.example.ja6.controller;

import com.example.ja6.entity.Category;
import com.example.ja6.entity.Product;
import com.example.ja6.service.impl.CategoryService;
import com.example.ja6.service.impl.ProducService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/cates")
public class restCates {
    @Autowired
    CategoryService categoryService;
    @GetMapping()
    public List<Category> getAll1(){
        return categoryService.findALl1();
    }

    @PostMapping()
    public Category create(@RequestBody Category category){
        return categoryService.create(category);
    }
    @PutMapping("{id}")
    public Category update(@RequestBody Category category,@PathVariable("id") Integer id){
        return categoryService.update(category);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        categoryService.delete(id);
    }
}
