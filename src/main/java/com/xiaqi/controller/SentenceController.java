package com.xiaqi.controller;

import com.xiaqi.bean.Message;
import com.xiaqi.entity.Sentence;
import com.xiaqi.service.SentenceService;
import com.xiaqi.util.ServerMessageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaqi
 * @date 2019/8/24
 */
@RestController
@RequestMapping("/sentence")
public class SentenceController {

    @Autowired
    private SentenceService sentenceService;

    @RequestMapping("/addSentence")
    public Message addSentence(Sentence sentence) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            sentenceService.addSentence(sentence);
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/deleteSentence")
    public Message deleteSentence(int sentenceId) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            sentenceService.deleteSentence(sentenceId);
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/updateSentence")
    public Message updateSentence(Sentence sentence) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            sentenceService.updateSentence(sentence);
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/selectSentenceById")
    public Message selectSentenceById(int sentenceId) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            message.setData(sentenceService.selectSentenceById(sentenceId));
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }
}
