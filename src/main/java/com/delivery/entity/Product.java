package com.delivery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Date;

@Data
@Table("product")
public class Product {
    @Id
    private int id;
    private String name;
    private String description;
    private int count;
    private int category;
    private int price;
    @Column("date_start")
    private Date dateStart;
    @Column("date_delete")
    private Date dateDelete;
    
}
