package com.pengkk27.pwstorage.dao;

import com.pengkk27.pwstorage.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface CategoryMapper {

    void addCategory(Category category, String userId);

    void updateCategory(Category category);

    List<Category> getAllCategory();

    List<Category> getCategoriesByUserId(String userId);

    void deleteCategoryById(String categoryId);

    void deleteCategoriesByUserId(String userId);
}
