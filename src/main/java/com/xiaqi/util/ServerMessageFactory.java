package com.xiaqi.util;

import com.xiaqi.bean.Message;

import java.security.PublicKey;

/**
 * @author xiaqi
 * @date 2019/8/17
 */
public class ServerMessageFactory {

    private ServerMessageFactory() {}

    public static Message generateServerMsgByType(StatusCode statusCode) {
        Message message = new Message();
        message.setCode(statusCode.getStatusCode());
        message.setMessage(statusCode.getMessage());
        return message;
    }

    public enum StatusCode {

        /**
         * 成功响应，200
         */
        SUCCESS(200,"处理成功"),
        /**
         * 服务器错误，500
         */
        SERVER_ERROR(500,"服务器错误");

        private int statusCode;

        private String message;

        StatusCode(int statusCode,String message) {
            this.statusCode = statusCode;
            this.message = message;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getMessage() {
            return message;
        }
    }
}
