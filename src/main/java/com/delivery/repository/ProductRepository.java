package com.delivery.repository;


import com.delivery.entity.Product;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;


public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findByCategory(int category);
    List<Product> findByName(String name);

    @Modifying
    @Transactional
    @Query("UPDATE product SET date_delete=:dateUpdate WHERE id=:id")
    void updateDateDeleteById(Date dateUpdate, int id);





}
