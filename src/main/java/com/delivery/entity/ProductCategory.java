package com.delivery.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ProductCategory {
    @Id
    private int id;
    private String nameCategory;

}
