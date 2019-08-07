package com.xiaqi.service.impl;

import com.xiaqi.bean.Message;
import com.xiaqi.entity.User;
import com.xiaqi.mapper.UserMapper;
import com.xiaqi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务类的实现
 * @author xiaqi
 * @date 2019/8/7
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Message login(User user) {
        Message message  = new Message();
        try {
            User userByUsernameAndPassword = userMapper.getUserByUsernameAndPassword(user.getUsername(), user.getPassword());
            message.setCode(200);
            if (null == user) {
                message.setMessage("用户名或密码错误");
                return message;
            }
            message.setMessage("登录成功");
            return message;
        } catch (Exception e) {
            message.setCode(500);
            message.setMessage("服务器错误");
            return message;
        }
    }

    @Override
    public Message getUserByUsername(String username) {
        return null;
    }

    @Override
    public Message updateUserInfo(User user) {
        Message message  = new Message();
        try {
            userMapper.updateByPrimaryKeySelective(user);
            message.setCode(200);
            message.setMessage("更新用户信息成功");
            return message;
        } catch (Exception e) {
            message.setCode(500);
            message.setMessage("服务器错误");
            return message;
        }
    }
}
