package com.delivery.entity;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class ProductMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

        return new Product(
//                rs.getInt("id"),
//                rs.getString("name"),
//                rs.getString("description"),
//                rs.getInt("count"),
//                rs.getInt("category"),
//                rs.getInt("price"),
//                Date.valueOf(rs.getString("date_start")),
//                Date.valueOf(rs.getString("date_delete"))
        );
    }
}
