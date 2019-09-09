package com.xiaqi.test.service;

import com.xiaqi.entity.Category;
import com.xiaqi.service.ArticleCategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author xiaqi
 * @date 2019/9/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ArticleCategoryServiceTest {

    @Autowired
    private ArticleCategoryService articleCategoryService;

    @Test
    public void testAddCategoryWithArticle() {
        int result = articleCategoryService.addCategoryWithArticle(1, 1);
        Assert.assertEquals(1L, result);
    }

    @Test
    public void testDeleteCategoryWithArticle() {
        Assert.assertEquals(1L, articleCategoryService.deleteCategoryWithArticle(1, 1));
    }

    @Test
    public void testSelectAllCategoryByArticleId() {
        List<Category> categories = articleCategoryService.selectAllCategoryByArticleId(1);
        System.out.println(categories);
    }
}
