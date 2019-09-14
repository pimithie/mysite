package com.xiaqi.service.impl;

import com.xiaqi.entity.User;
import com.xiaqi.mapper.UserMapper;
import com.xiaqi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public boolean login(User user) {
        User res = userMapper.getUserByUsernameAndPassword(user.getUsername(), user.getPassword());
        return null != res;
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.getUsersByUsername(username).get(0);
    }

    @Override
    public int updateUserInfo(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.findAll();
    }
}
