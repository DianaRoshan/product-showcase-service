package com.delivery.repository;

import com.delivery.entity.ProductCategory;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<ProductCategory, Integer> {
}
