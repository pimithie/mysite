package com.xiaqi.service;

import com.xiaqi.entity.Category;

import java.util.List;

/**
 * @author xiaqi
 * @date 2019/8/27
 */
public interface ArticleCategoryService {

    /**
     * 给指定文章添加一个分类
     * @param categoryId 分类id
     * @param articleId 文章id
     * @return 影响行数
     */
    int addCategoryWithArticle(int categoryId,long articleId);

    /**
     * 给指定文章删除一个分类
     * @param categoryId 分类id
     * @param articleId 文章id
     * @return 影响行数
     */
    int deleteCategoryWithArticle(int categoryId,long articleId);

    /**
     * 查询指定文章所有的分类
     * @param articleId 分类id
     * @return 文章分类实体列表
     */
    List<Category> selectAllCategoryByArticleId(long articleId);
}
