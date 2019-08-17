package com.xiaqi.controller;

import com.xiaqi.bean.Message;
import com.xiaqi.entity.Tag;
import com.xiaqi.service.TagService;
import com.xiaqi.util.ServerMessageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xiaqi.util.ServerMessageFactory.StatusCode;

/**
 * @author xiaqi
 * @date 2019/8/17
 */
@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @RequestMapping("/getAllTagsByArticleId")
    public Message getAllTagsByArticleId(long articleId) {
        //TODO: 表article_tag进行处理
        return null;
    }

    @RequestMapping("/getTagsByTagNameBlur")
    public Message getTagsByTagNameBlur(String tagNamePrefix) {
        Message message = ServerMessageFactory.generateServerMsgByType(StatusCode.SUCCESS);
        try {
            message.setMessage(StatusCode.SUCCESS.getMessage());
            message.setData(tagService.getTagsByTagNameBlur(tagNamePrefix));
            return message;
        } catch (Exception e) {
            message.setCode(StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/getTagByid")
    public Message getTagByid(int tagId) {
        Message message = ServerMessageFactory.generateServerMsgByType(StatusCode.SUCCESS);
        try {
            message.setMessage(StatusCode.SUCCESS.getMessage());
            message.setData(tagService.selectTagById(tagId));
            return message;
        } catch (Exception e) {
            message.setCode(StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/updateTagById")
    public Message updateTagById(Tag tag) {
        Message message = ServerMessageFactory.generateServerMsgByType(StatusCode.SUCCESS);
        try {
            message.setMessage(StatusCode.SUCCESS.getMessage());
            tagService.updateTagById(tag);
            return message;
        } catch (Exception e) {
            message.setCode(StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/deleteByTagId")
    public Message deleteByTagId(int tagId) {
        Message message = ServerMessageFactory.generateServerMsgByType(StatusCode.SUCCESS);
        try {
            message.setMessage(StatusCode.SUCCESS.getMessage());
            tagService.deleteTagById(tagId);
            return message;
        } catch (Exception e) {
            message.setCode(StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/addTag")
    public Message addTag(Tag tag) {
        Message message = ServerMessageFactory.generateServerMsgByType(StatusCode.SUCCESS);
        try {
            message.setMessage(StatusCode.SUCCESS.getMessage());
            tagService.addTag(tag);
            return message;
        } catch (Exception e) {
            message.setCode(StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

}
