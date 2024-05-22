package com.delivery.service;

import com.delivery.entity.Product;
import com.delivery.entity.ProductCategory;
import org.springframework.stereotype.Service;
import com.delivery.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addNewProduct(Product product){
        int result = productRepository.insert(product);
        if (result != 1) {
            throw new IllegalStateException("oops something went wrong");
        }
    }

    public List<Product> showAllProducts(){
        return productRepository.findAll();
    }
    public List<ProductCategory> showAllCategories(){
        return productRepository.findAllCategories();
    }
}
