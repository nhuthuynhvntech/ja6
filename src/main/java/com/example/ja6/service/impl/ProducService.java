package com.example.ja6.service.impl;

import com.example.ja6.entity.Product;

import java.util.List;

public interface ProducService  {
    List<Product> findALl();

    Product findById(Integer id);

    List<Product> findbyCategoryId(String cid);

    Product create(Product product);

    Product update(Product product);

   void  delete(Integer id);
}
