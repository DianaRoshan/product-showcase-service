package com.delivery.repository;

import com.delivery.entity.Product;
import com.delivery.entity.ProductCategory;
import com.delivery.entity.ProductMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository{

    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final ProductMapper productMapper;


    public ProductRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate, ProductMapper productMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.productMapper = productMapper;
    }

    @Override
    public int insert(Product product) {
        String sql ="INSERT INTO product (name, description, count, category, price, date_start, date_delete) " +
                "VALUES (:name, :description, :count, :category, :price, :date_start, :date_delete)";
        SqlParameterSource params = new MapSqlParameterSource()
                .addValue("name", product.getName())
                .addValue("description", product.getDescription())
                .addValue("count", product.getCount())
                .addValue("category", product.getCategory().getId())
                .addValue("price", product.getPrice())
                .addValue("date_start", product.getDateStart())
                .addValue("date_delete", product.getDateDelete());
        return jdbcTemplate.queryForObject(sql, params, Integer.class);
    }

    @Override
    public int update(Product product) {
        String sql ="";
        return 0;
    }

    @Override
    public int deleteById(Long id) {
        String sql ="";
        return 0;
    }

    @Override
    public List<Product> findAll() {
        String sql ="SELECT * FROM product";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>());
    }

    @Override
    public List<ProductCategory> findAllCategories() {
        String sql ="SELECT * FROM product_category";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>());
    }

    @Override
    public ProductCategory findCategoryById(int id) {
        String sql="SELECT name_category FROM product_category WHERE id=:id";
        SqlParameterSource params = new MapSqlParameterSource()
                .addValue("id", id);
        return jdbcTemplate.queryForObject(sql, params, ProductCategory.class);
    }

    @Override
    public Product findById(Long id) {
        String sql ="";
        return null;
    }

    @Override
    public List<Product> findByCategory(ProductCategory category) {
        String sql ="";
        return null;
    }
}
