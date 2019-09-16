package com.xiaqi.controller;

import com.xiaqi.bean.Message;
import com.xiaqi.service.ArticleService;
import com.xiaqi.util.ServerMessageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章控制器
 * @author xiaqi
 * @date 2019/8/10
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/getAllArticles")
    public Message getAllArticles(){
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            message.setData(articleService.getAllArticles());
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/getAllHotArticls")
    public Message getAllHotArticls(){
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            message.setData(articleService.getAllHotArticles());
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/getAllTopArticls")
    public Message getAllTopArticles(){
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            message.setData(articleService.getAllTopArticles());
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/getArticlsByCatagory")
    public Message getArticlsByCatagory(int categoryId){
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            message.setData(articleService.getArticlesByCatagory(categoryId));
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }
}
