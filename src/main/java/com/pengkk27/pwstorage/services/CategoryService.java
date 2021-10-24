package com.pengkk27.pwstorage.services;

import com.pengkk27.pwstorage.entity.Category;

import java.util.List;

public interface CategoryService {

    void addCategory(Category category, String userId);

    void updateCategory(Category category);

    List<Category> getCategoriesByUserId(String userId);

    void deleteCategoryById(String categoryId);

    void deleteCategoriesByUserId(String userId);
}
