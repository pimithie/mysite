package com.xiaqi.mapper;

import com.xiaqi.entity.ArticleCategory;

public interface ArticleCategoryMapper {
    int insert(ArticleCategory record);

    int insertSelective(ArticleCategory record);
}