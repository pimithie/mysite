package com.xiaqi.controller;

import com.xiaqi.bean.Message;
import com.xiaqi.service.ArticleCategoryService;
import com.xiaqi.util.ServerMessageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaqi
 * @date 2019/8/29
 */
@RestController
@RequestMapping("/articleCategory")
public class ArticleCategoryController {

    @Autowired
    private ArticleCategoryService articleCategoryService;

    @RequestMapping("/addCategoryWithArticle")
    public Message addCategoryWithArticle(int categoryId,long articleId) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            articleCategoryService.addCategoryWithArticle(categoryId,articleId);
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/deleteCategoryWithArticle")
    public Message deleteCategoryWithArticle(int categoryId,long articleId) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            articleCategoryService.deleteCategoryWithArticle(categoryId,articleId);
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/selectAllCategoryByArticleId")
    public Message selectAllCategoryByArticleId(long articleId) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            message.setData(articleCategoryService.selectAllCategoryByArticleId(articleId));
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

}
