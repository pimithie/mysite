package com.xiaqi.test.service;

import java.util.Date;

import com.xiaqi.bean.Message;
import com.xiaqi.entity.Comment;
import com.xiaqi.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xiaqi
 * @date 2019/9/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CommentServiceTest {

    @Autowired
    private CommentService commentService;

    @Test
    public void testGetAllCommentsByArticleId() {
        Message message = commentService.getAllCommentsByArticleId(1);
        System.out.println(message);
    }

    @Test
    public void testInsertComment() {
        Comment comment = new Comment();
        comment.setArticleId(1L);
        comment.setPublishTime(new Date());
        comment.setPublishId(0);
        comment.setUp(0L);
        comment.setDown(0L);
        comment.setIsTop((byte) 0);
        comment.setIsDelete((byte) 0);
        System.out.println(commentService.insertComment(comment));
    }

    @Test
    public void testUpdateComment() {
        Comment comment = new Comment();
        comment.setId(1);
        comment.setArticleId(1L);
        comment.setPublishTime(new Date());
        System.out.println(commentService.updateComment(comment));
    }


}
