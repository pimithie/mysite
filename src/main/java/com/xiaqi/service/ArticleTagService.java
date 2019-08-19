package com.xiaqi.service;

import com.xiaqi.entity.ArticleTag;
import com.xiaqi.entity.Tag;

import java.util.List;

/**
 * @author xiaqi
 * @date 2019/8/19
 */
public interface ArticleTagService {

    int addTagWithArticle(int tagId,long articleId);

    int removeTagWithArticle(int tagId,long articleId);

    List<Tag> selectAllTagsByArticleId(long articleId);

}
