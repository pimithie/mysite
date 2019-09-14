package com.xiaqi.service.impl;

import com.xiaqi.entity.Article;
import com.xiaqi.mapper.ArticleMapper;
import com.xiaqi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章服务实现类
 * @author xiaqi
 * @date 2019/8/10
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> getAllArticles() {
        return articleMapper.getAllArticles();
    }

    @Override
    public List<Article> getAllHotArticles() {
        return articleMapper.getAllHotArticles();
    }

    @Override
    public List<Article> getAllTopArticles() {
        return articleMapper.getAllTopArticles();
    }

    @Override
    public List<Article> getArticlesByCatagory(int categoryId) {
        return articleMapper.getArticlesByCategory(categoryId);
    }
}
