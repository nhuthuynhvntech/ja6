package com.example.ja6.service.impl;

import com.example.ja6.dao.CategoryDAO;
import com.example.ja6.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryImpl implements CategoryService{
@Autowired
CategoryDAO categoryDAO;
    @Override
    public List<Category> findALl() {
        return categoryDAO.findAll();
    }

    @Override
    public Object findAll() {
        return null;
    }

    @Override
    public List<Category> findALl1() {
        return categoryDAO.findAll();
    }

    @Override
    public Category findById(Integer id) {
        return null;
    }

    @Override
    public List<Category> findbyCategoryId(String cid) {
        return null;
    }

    @Override
    public Category create(Category category) {
        return categoryDAO.save(category);
    }

    @Override
    public Category update(Category category) {
        return categoryDAO.save(category);
    }

    @Override
    public void delete(Integer id) {

    }
}

