package com.example.ja6.service.impl;

import com.example.ja6.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findALl();

    Object findAll();

    List<Category> findALl1();

    Category findById(Integer id);

    List<Category> findbyCategoryId(String cid);

    Category create(Category category);

    Category update(Category category);

    void  delete(Integer id);



}
