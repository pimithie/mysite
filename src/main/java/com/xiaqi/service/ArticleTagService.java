package com.xiaqi.service;

import com.xiaqi.entity.Tag;

import java.util.List;

/**
 * 文章标签服务接口
 * @author xiaqi
 * @date 2019/8/19
 */
public interface ArticleTagService {

    /**
     * 给文章添加标签
     * @param tagId 标签id
     * @param articleId 文章id
     * @return 影响行数
     */
    int addTagWithArticle(int tagId,long articleId);

    /**
     * 给文章删除标签
     * @param tagId 标签id
     * @param articleId 文章id
     * @return 影响行数
     */
    int removeTagWithArticle(int tagId,long articleId);

    /**
     * 查询文章的所有标签
     * @param articleId 文章id
     * @return 标签列表
     */
    List<Tag> selectAllTagsByArticleId(long articleId);

}
