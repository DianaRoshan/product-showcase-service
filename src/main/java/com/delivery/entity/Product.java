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
    @MappedCollection
    private ProductCategory category;
    private int price;
    private Date dateStart;
    private Date dateDelete;

    public Product(String name, String description, int count, ProductCategory category, int price, Date dateStart, Date dateDelete) {
        this.name = name;
        this.description = description;
        this.count = count;
        this.category = category;
        this.price = price;
        this.dateStart = dateStart;
        this.dateDelete = dateDelete;
    }
}
