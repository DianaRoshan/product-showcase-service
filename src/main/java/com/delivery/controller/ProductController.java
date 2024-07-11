package com.delivery.controller;

import com.delivery.entity.Product;
import org.springframework.web.bind.annotation.*;
import com.delivery.service.ProductService;

import java.sql.Date;
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
    public List<Product> allProducts(){
        return service.showAllProducts();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Integer id){
        service.deleteProductById(id);
    }

    @GetMapping("/find/{category}")
    public List<Product> findByCategory(@PathVariable int category){
        return service.findProductByCategory(category);
    }

    @GetMapping("/find/{name}")
    public List<Product> findByName(@PathVariable String name){
        return service.findProductByName(name);
    }

    @PostMapping("/update/{id}")
    public void updateProduct(@RequestParam Date date,
                              @PathVariable int id,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String description,
                              @RequestParam(defaultValue = "0") int category,
                              @RequestParam(defaultValue = "0") int count,
                              @RequestParam(defaultValue = "0") int price){
        service.updateProductById(date,id,name,description,category,count,price);
    }

}
