package com.example.ja6.service.impl;

import com.example.ja6.dao.ProductDAO;
import com.example.ja6.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProducService{
    @Autowired
    ProductDAO pdao;

    @Override
    public List<Product> findALl() {
        return pdao.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return pdao.findById(id).get();
    }

    @Override
    public List<Product> findbyCategoryId(String cid) {
        return pdao.findCategoryid(cid);
    }

    @Override
    public Product create(Product product) {
        return pdao.save(product);
    }

    @Override
    public Product update(Product product) {
        return pdao.save(product);
    }

    @Override
    public void delete(Integer id) {
         pdao.deleteById(id);
    }
}
