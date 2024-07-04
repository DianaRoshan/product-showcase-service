package com.delivery.service;

import com.delivery.entity.Product;
import org.springframework.stereotype.Service;
import com.delivery.repository.ProductRepository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

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

    public void deleteProductById(Integer id){
        productRepository.deleteById(id);
    }

    public List<Product> findProductByCategory(int category){
        return productRepository.findByCategory(category);
    }

    public List<Product> findProductByName(String name){
        return productRepository.findByName(name);
    }

    public void updateProductById(Date date, int id, String name, String description, int category, int count, int price){
        Optional<Product> productOptional = productRepository.findById(id);
        if(productOptional.isPresent()) {
            productRepository.updateDateDeleteById(date, id);
            Product product = new Product();
            product.setName(productOptional.get().getName());
            product.setDescription(productOptional.get().getDescription());
            product.setCount(productOptional.get().getCount());
            product.setCategory(productOptional.get().getCategory());
            product.setPrice(productOptional.get().getPrice());
            product.setDateStart(date);
            product.setDateDelete(null);

            if(name!=null) product.setName(name);
            if (description!=null) product.setDescription(description);
            if (category!=0) product.setCategory(category);
            if (count!=0) product.setCount(count);
            if (price!=0) product.setPrice(price);


            productRepository.save(product);
        }

    }

}
