package com.xiaqi.controller;

import com.xiaqi.bean.Message;
import com.xiaqi.entity.Category;
import com.xiaqi.service.CategoryService;
import com.xiaqi.util.ServerMessageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaqi
 * @date 2019/8/29
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/addCategory")
    public Message addCategory(Category category) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            categoryService.addCategory(category);
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/updateCategoryByIdSelective")
    public Message updateCategoryByIdSelective(Category category) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            categoryService.updateCategoryByIdSelective(category);
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/deleteCategoryById")
    public Message deleteCategoryById(int categoryId) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            categoryService.deleteCategoryById(categoryId);
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/selectAllCategory")
    public Message selectAllCategory() {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            message.setData(categoryService.selectAllCategory());
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/selectCategoryById")
    public Message selectCategoryById(int categoryId) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            message.setData(categoryService.selectCategoryById(categoryId));
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }

    @RequestMapping("/selectCategoryByNamePostBlur")
    public Message selectCategoryByNamePostBlur(String prefix) {
        Message message = ServerMessageFactory.generateServerMsgByType(ServerMessageFactory.StatusCode.SUCCESS);
        try {
            message.setData(categoryService.selectCategoryByNamePostBlur(prefix));
            return message;
        } catch (Exception e) {
            message.setCode(ServerMessageFactory.StatusCode.SERVER_ERROR.getStatusCode());
            message.setMessage(ServerMessageFactory.StatusCode.SERVER_ERROR.getMessage());
            return message;
        }
    }
}
