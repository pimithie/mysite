package com.xiaqi.service;

import com.xiaqi.bean.Message;
import com.xiaqi.entity.Comment;

/**
 * 评论服务接口
 * @author xiaqi
 * @date 2019/8/11
 */
public interface CommentService {

    /**
     * 获取某文章的所有评论
     * @param articleId 文章id
     * @return 服务器响应实体
     */
    Message getAllCommentsByArticleId(long articleId);

    /**
     * 某文章新增评论
     * @param comment 新增的评论
     * @param articleId 文章id
     * @return 服务器响应实体
     */
    Message insertComment(Comment comment);

    /**
     * 更新评论
     * @param comment 文章id
     * @return 服务器响应实体
     */
    Message updateComment(Comment comment);

}
