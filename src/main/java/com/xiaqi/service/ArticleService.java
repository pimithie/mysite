package com.xiaqi.service;

import com.xiaqi.bean.Message;


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
    Message getAllArticles();

    /**
     * 获取所有热门文章
     * @return 服务器响应实体
     */
    Message getAllHotArticls();

    /**
     * 获取所有置顶文章
     * @return 服务器响应实体
     */
    Message getAllTopArticls();

    /**
     * 获取指定分类的文章
     * @return 服务器响应实体
     */
    Message getArticlsByCatagory(int categoryId);


}
