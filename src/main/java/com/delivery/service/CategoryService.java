package com.delivery.service;

import com.delivery.entity.ProductCategory;
import com.delivery.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void addCategory(ProductCategory category){
        categoryRepository.save(category);
    }

    public List<ProductCategory> showAllCategories(){
        return (List<ProductCategory>) categoryRepository.findAll();
    }

    public void deleteCategory(int id){
        categoryRepository.deleteById(id);
    }
}
