package com.delivery.repository;


import com.delivery.entity.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product,Integer> {

}
