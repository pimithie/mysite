package com.xiaqi.controller;

import com.xiaqi.bean.Message;
import com.xiaqi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章控制器
 * @author xiaqi
 * @date 2019/8/10
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/getAllArticles")
    public Message getAllArticles(){
        return articleService.getAllArticles();
    }

    @RequestMapping("/getAllHotArticls")
    public Message getAllHotArticls(){
        return articleService.getAllHotArticles();
    }

    @RequestMapping("/getAllTopArticls")
    public Message getAllTopArticls(){
        return articleService.getAllTopArticles();
    }

    @RequestMapping("/getArticlsByCatagory")
    public Message getArticlsByCatagory(int categoryId){
        return articleService.getArticlesByCatagory(categoryId);
    }
}
