package com.pengkk27.pwstorage.dao;

import com.pengkk27.pwstorage.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    void addCategory(Category category);

    void updateCategory(Category category);

    List<Category> getAllCategory();

    void deleteCategoryById(String categoryId);
}
