package com.xiaqi.service;

import com.xiaqi.bean.Message;
import com.xiaqi.entity.Article;

import java.util.List;


/**
 * 文章服务接口
 * @author xiaqi
 * @date 2019/8/9
 */
public interface ArticleService {

    /**
     * 获取所有文章
     * @return 服务器响应实体
     */
    List<Article> getAllArticles();

    /**
     * 获取所有热门文章
     * @return 服务器响应实体
     */
    List<Article> getAllHotArticles();

    /**
     * 获取所有置顶文章
     * @return 服务器响应实体
     */
    List<Article> getAllTopArticles();

    /**
     * 获取指定分类的文章
     * @return 服务器响应实体
     */
    List<Article> getArticlesByCatagory(int categoryId);


}
