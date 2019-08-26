package com.xiaqi.test.service;

import com.xiaqi.bean.Message;
import com.xiaqi.service.ArticleService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 文章服务测试类
 * @author xiaqi
 * @date 2019/8/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ArticleServiceTest {

    @Autowired
    private ArticleService articleService;

    @Test
    public void testGetAllArticles() {
        System.out.println(articleService.getAllArticles());
    }

    @Test
    public void testGetAllHotArticles() {
        System.out.println(articleService.getAllHotArticles());
    }

    @Test
    public void testGetAllTopArticles() {
        System.out.println(articleService.getAllTopArticles());
    }

    @Test
    public void testGetArticlesByCatagory() {
        System.out.println(articleService.getArticlesByCatagory(1));
    }

}
