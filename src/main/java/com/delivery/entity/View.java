package com.delivery.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class View {

    private int id;
    private String name;
    private String description;
    private int count;
    private String nameCategory;
    private int price;
    private Date dateStart;
    private Date dateDelete;
}
