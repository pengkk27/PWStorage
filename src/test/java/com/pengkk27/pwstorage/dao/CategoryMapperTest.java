package com.pengkk27.pwstorage.dao;

import com.pengkk27.pwstorage.entity.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryMapperTest {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void addCategoryTest() {
        Category category1 = new Category("123457", "生活");
        Category category2 = new Category("123458", "金融");
        categoryMapper.addCategory(category1, "123456");
        categoryMapper.addCategory(category2, "123456");
    }

    @Test
    public void updateCategoryTest() {
        Category category = new Category("123457", "家庭");
        categoryMapper.updateCategory(category);
    }

    @Test
    public void getAllCategoryTest() {
        for (Category category : categoryMapper.getAllCategory()) {
            System.out.println(category.toString());
        }
    }

    @Test
    public void getCategoriesByUserIdTest() {
        for (Category category : categoryMapper.getCategoriesByUserId("123456")) {
            System.out.println(category.toString());
        }
    }

    @Test
    public void deleteCategoryByIdTest() {
        categoryMapper.deleteCategoryById("123456");
    }

    @Test
    public void deleteCategoriesByUserIdTest() {
        categoryMapper.deleteCategoriesByUserId("123456");
    }

}
