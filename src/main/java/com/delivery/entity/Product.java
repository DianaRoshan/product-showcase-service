package com.delivery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private int id;
    private String name;
    private String description;
    private int count;
    @MappedCollection(idColumn = "id")
    private ProductCategory category;
    private int price;
    private Date dateStart;
    private Date dateDelete;
    
}
