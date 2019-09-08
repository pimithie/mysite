package com.xiaqi.test.service;

import com.xiaqi.entity.Category;
import com.xiaqi.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author xiaqi
 * @date 2019/9/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CategoryServiceTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void testAddCategory() {
        Category category = new Category();
        category.setCatagoryName("xxx");
        categoryService.addCategory(category);
    }

    @Test
    public void testUpdateCategoryByIdSelective() {
        Category category = new Category();
        category.setCatagoryName("xxx");
        categoryService.updateCategoryByIdSelective(category);
    }

    @Test
    public void testDeleteCategoryById() {
        categoryService.deleteCategoryById(1);
    }

    @Test
    public void testSelectAllCategory() {
        List<Category> categories = categoryService.selectAllCategory();
        System.out.println(categories);
    }

    @Test
    public void testSelectCategoryById() {
        Category category = categoryService.selectCategoryById(1);
        System.out.println(category);
    }

    @Test
    public void testSelectCategoryByNamePostBlur() {
        List<Category> categories = categoryService.selectCategoryByNamePostBlur("xx");
        System.out.println(categories);
    }

}
