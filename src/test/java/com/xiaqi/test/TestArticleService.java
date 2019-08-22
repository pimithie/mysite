package com.xiaqi.test;

import com.xiaqi.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xiaqi
 * @date 2019/8/22
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestArticleService {

    @Autowired
    private ArticleService articleService;

    @Test
    public void testRedisCacheAspect() {
        articleService.getAllArticles();
    }
}
