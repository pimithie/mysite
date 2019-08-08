package com.xiaqi.test;

import com.xiaqi.bean.Message;
import com.xiaqi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xiaqi
 * @date 2019/8/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUserService {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        Message allUsers = userService.getAllUsers();
        System.out.println(allUsers.getData());
        Message user = userService.getUserByUsername("admin");
        System.out.println(user.getData());
    }
}
