package com.delivery.repository;

import com.delivery.entity.Product;
import com.delivery.entity.View;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface ViewRepository extends CrudRepository<Product, Integer> {

    @Transactional
    @Query(value = """
            SELECT p.id, p.name, p.description, p.count,
                   c.name_category, p.price, p.date_start, p.date_delete
            FROM product p
            LEFT JOIN product_category c ON p.category=c.id
            """)
    List<View> getProductWithCategory();


}
