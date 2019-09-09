package com.xiaqi.test.service;

import com.xiaqi.entity.Tag;
import com.xiaqi.service.ArticleTagService;
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
public class ArticleTagServiceTest {

    @Autowired
    private ArticleTagService articleTagService;

    @Test
    public void testAddTagWithArticle() {
        Assert.assertEquals(1L,articleTagService.addTagWithArticle(1,1));
    }

    @Test
    public void testRemoveTagWithArticle() {
        Assert.assertEquals(1L,articleTagService.removeTagWithArticle(1,1));
    }

    @Test
    public void testSelectAllTagsByArticleId() {
        List<Tag> list = articleTagService.selectAllTagsByArticleId(1);
        System.out.println(list);
    }

}
