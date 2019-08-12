package com.xiaqi.mapper;

import com.xiaqi.entity.Comment;

import java.util.List;

/**
 * 评论Mapper
 * @author xiaqi
 */
public interface CommentMapper {

    /**
     * 删除一条评论
     * @param id 评论id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新增一条评论
     * @param record 新增的评论
     * @return 影响行数
     */
    int insert(Comment record);

    /**
     * 更新评论，填写需更新的字段
     * @param record 需要修改的字段
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * 更新评论
     * @param record 更新之后的评论实体
     * @return 影响行数
     */
    int updateByPrimaryKey(Comment record);

    /**
     * 获取某篇文章的评论
     * @param articleId 文章id
     * @return 文章的列表
     */
    List<Comment> getAllCommentsByArticleId(long articleId);


}