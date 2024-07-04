package com.delivery.controller;

import com.delivery.entity.ProductCategory;
import com.delivery.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product-showcase/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/add")
    public void addCategory(@RequestBody ProductCategory category){
        categoryService.addCategory(category);
    }

    @GetMapping("/all")
    public List<ProductCategory> getAllCategories(){
        return categoryService.showAllCategories();
    }

    @DeleteMapping("/delete")
    public void deleteCategoryById(int id){
        categoryService.deleteCategory(id);
    }
}
