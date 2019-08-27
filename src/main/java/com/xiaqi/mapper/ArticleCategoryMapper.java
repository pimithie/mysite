package com.xiaqi.mapper;

import com.xiaqi.entity.ArticleCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ArticleCategoryMapper {
    int insert(ArticleCategory record);

    int insertSelective(ArticleCategory record);

    int deleteCategoryWithArticle(@Param("categoryId") int categoryId, @Param("articleId") long articleId);

    List<Integer> selectAllCategoryByArticleId(long articleId);
}