package com.xiaqi.service.impl;

import com.xiaqi.annotation.EnableCache;
import com.xiaqi.bean.Message;
import com.xiaqi.mapper.ArticleMapper;
import com.xiaqi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章服务实现类
 * @author xiaqi
 * @date 2019/8/10
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    @EnableCache(true)
    public Message getAllArticles() {
        Message message = new Message();
        try {
//            message.setCode(200);
//            message.setMessage("查询所有文章成功");
//            message.setData(articleMapper.getAllArticles());
            System.out.println("查询所有文章成功");
            return message;
        } catch (Exception e) {
            message.setCode(500);
            message.setMessage("服务器错误");
            return message;
        }
    }

    @Override
    public Message getAllHotArticles() {
        Message message = new Message();
        try {
            message.setCode(200);
            message.setMessage("查询所有文章成功");
            message.setData(articleMapper.getAllHotArticles());
            return message;
        } catch (Exception e) {
            message.setCode(500);
            message.setMessage("服务器错误");
            return message;
        }
    }

    @Override
    public Message getAllTopArticles() {
        Message message = new Message();
        try {
            message.setCode(200);
            message.setMessage("查询所有文章成功");
            message.setData(articleMapper.getAllTopArticles());
            return message;
        } catch (Exception e) {
            message.setCode(500);
            message.setMessage("服务器错误");
            return message;
        }
    }

    @Override
    public Message getArticlesByCatagory(int categoryId) {
        Message message = new Message();
        try {
            message.setCode(200);
            message.setMessage("查询所有文章成功");
            message.setData(articleMapper.getArticlesByCategory(categoryId));
            return message;
        } catch (Exception e) {
            message.setCode(500);
            message.setMessage("服务器错误");
            return message;
        }
    }
}
