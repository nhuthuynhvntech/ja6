package com.example.ja6.dao;

import com.example.ja6.entity.Product;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface ProductDAO extends JpaRepository<Product,Integer> {
@Query("SELECT p from Product p where p.category.id=?1")
    List<Product> findCategoryid(String cid);
}
