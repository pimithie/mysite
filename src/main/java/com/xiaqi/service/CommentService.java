package com.xiaqi.service;

import com.xiaqi.bean.Message;
import com.xiaqi.entity.Comment;

import java.util.List;

/**
 * 评论服务接口
 * @author xiaqi
 * @date 2019/8/11
 */
public interface CommentService {

    /**
     * 获取某文章的所有评论
     * @param articleId 文章id
     * @return id为articleId的文章的所有评论
     */
    List<Comment> getAllCommentsByArticleId(long articleId);

    /**
     * 某文章新增评论
     * @param comment 新增的评论
     * @return 影响行数
     */
    int insertComment(Comment comment);

    /**
     * 更新评论
     * @param comment 文章id
     * @return 影响行数
     */
    int updateComment(Comment comment);

}
