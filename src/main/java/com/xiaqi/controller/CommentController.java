package com.xiaqi.controller;

import com.xiaqi.bean.Message;
import com.xiaqi.entity.Comment;
import com.xiaqi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 评论控制器
 * @author xiaqi
 * @date 2019/8/12
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("/getAllCommentsByArticleId")
    public Message getAllCommentsByArticleId(long articleId) {
        return commentService.getAllCommentsByArticleId(articleId);
    }

    @RequestMapping("/addComment")
    public Message addComment(Comment comment) {
        return commentService.insertComment(comment);
    }

    @RequestMapping("/updateComment")
    public Message updateComment(Comment comment) {
        return commentService.updateComment(comment);
    }


}
