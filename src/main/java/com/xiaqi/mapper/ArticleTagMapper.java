package com.xiaqi.mapper;

import com.xiaqi.entity.ArticleTag;

public interface ArticleTagMapper {
    int insert(ArticleTag record);

    int insertSelective(ArticleTag record);
}