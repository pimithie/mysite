package com.xiaqi.service.impl;

import com.xiaqi.entity.Comment;
import com.xiaqi.mapper.CommentMapper;
import com.xiaqi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 评论服务实现类
 * @author xiaqi
 * @date 2019/8/12
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> getAllCommentsByArticleId(long articleId) {
        return commentMapper.getAllCommentsByArticleId(articleId);
    }

    @Override
    public int insertComment(Comment comment) {
        return commentMapper.insert(comment);
    }

    @Override
    public int updateComment(Comment comment) {
        return commentMapper.updateByPrimaryKeySelective(comment);
    }
}
