package com.xiaqi.mapper;

import com.xiaqi.entity.ArticleTag;

import java.util.List;

public interface ArticleTagMapper {
    int insert(ArticleTag record);

    int delete(ArticleTag record);

    List<Integer> getAllTagsByArticleId(long articleId);
}