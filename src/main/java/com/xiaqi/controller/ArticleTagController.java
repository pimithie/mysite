package com.xiaqi.controller;

import com.xiaqi.bean.Message;
import com.xiaqi.service.ArticleTagService;
import com.xiaqi.util.ServerMessageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaqi
 * @date 2019/8/20
 */
@RestController
@RequestMapping("/articleTag")
public class ArticleTagController {

    @Autowired
    private ArticleTagService articleTagService;

    @RequestMapping("/addTagWithArticle")
    public Message addTagWithArticle(int tagId,long articleId) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            articleTagService.addTagWithArticle(tagId,articleId);
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/removeTagWithArticle")
    public Message removeTagWithArticle(int tagId,long articleId) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            articleTagService.removeTagWithArticle(tagId,articleId);
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/selectAllTagsWithArticle")
    public Message selectAllTagsWithArticle(long articleId) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            message.setData(articleTagService.selectAllTagsByArticleId(articleId));
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }
}
