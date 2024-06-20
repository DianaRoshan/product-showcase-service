package com.delivery.service;

import com.delivery.entity.Product;
import org.springframework.stereotype.Service;
import com.delivery.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
     private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addNewProduct(Product product){
        productRepository.save(product);
    }

    public List<Product> showAllProducts(){
        return (List<Product>) productRepository.findAll();
    }

}
