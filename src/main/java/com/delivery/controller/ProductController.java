package com.delivery.controller;

import com.delivery.entity.Product;
import org.springframework.web.bind.annotation.*;
import com.delivery.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("api/product-showcase")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product) {
        service.addNewProduct(product);
    }

    @GetMapping("/all")
    private List<Product> allProducts(){
        return service.showAllProducts();
    }

}
