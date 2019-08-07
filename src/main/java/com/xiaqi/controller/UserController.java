package com.xiaqi.controller;

import com.xiaqi.bean.Message;
import com.xiaqi.entity.User;
import com.xiaqi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaqi
 * @date 2019/8/7
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Message login(User user) {
        return userService.login(user);
    }

}
