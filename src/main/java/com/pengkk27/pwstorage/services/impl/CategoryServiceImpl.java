package com.pengkk27.pwstorage.services.impl;

import com.pengkk27.pwstorage.dao.CategoryMapper;
import com.pengkk27.pwstorage.entity.Category;
import com.pengkk27.pwstorage.services.CategoryService;
import com.pengkk27.pwstorage.tools.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void addCategory(Category category, String userId) {
        category.setCategoryId(Tools.getUUID());
        categoryMapper.addCategory(category, userId);
    }

    @Override
    public void updateCategory(Category category) {
        categoryMapper.updateCategory(category);
    }

    @Override
    public List<Category> getCategoriesByUserId(String userId) {
        return categoryMapper.getCategoriesByUserId(userId);
    }

    @Override
    public void deleteCategoryById(String categoryId) {
        categoryMapper.deleteCategoryById(categoryId);
    }

    @Override
    public void deleteCategoriesByUserId(String userId) {
        categoryMapper.deleteCategoriesByUserId(userId);
    }
}
