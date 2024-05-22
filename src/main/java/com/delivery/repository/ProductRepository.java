package com.delivery.repository;


import com.delivery.entity.Product;
import com.delivery.entity.ProductCategory;

import java.util.List;

public interface ProductRepository{
    int insert(Product product);
    int update(Product product);
    int deleteById(Long id);
    List<Product> findAll();
    List<ProductCategory> findAllCategories();
    Product findById(Long id);
    List<Product> findByCategory(ProductCategory category);

}
