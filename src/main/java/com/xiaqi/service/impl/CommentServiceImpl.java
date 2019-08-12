package com.xiaqi.service.impl;

import com.xiaqi.bean.Message;
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
    public Message getAllCommentsByArticleId(long articleId) {
        Message message = new Message();
        try {
            List<Comment> comments = commentMapper.getAllCommentsByArticleId(articleId);
            message.setCode(200);
            message.setMessage("查询成功");
            message.setData(comments);
            return message;
        } catch (Exception e) {
            message.setCode(500);
            message.setMessage("服务器错误");
            return message;
        }
    }

    @Override
    public Message insertComment(Comment comment) {
        Message message = new Message();
        try {
            commentMapper.insert(comment);
            message.setCode(200);
            message.setMessage("查询成功");
            return message;
        } catch (Exception e) {
            message.setCode(500);
            message.setMessage("服务器错误");
            return message;
        }
    }

    @Override
    public Message updateComment(Comment comment) {
        Message message = new Message();
        try {
            commentMapper.updateByPrimaryKeySelective(comment);
            message.setCode(200);
            message.setMessage("查询成功");
            return message;
        } catch (Exception e) {
            message.setCode(500);
            message.setMessage("服务器错误");
            return message;
        }
    }
}
