package com.xiaqi.service;

import com.xiaqi.bean.Message;
import com.xiaqi.entity.User;

/**
 * 用户服务接口
 * @author xiaqi
 * @date 2019/8/6
 */
public interface UserService {

    /**
     * 登录访问接口
     * @param user 登录用户信息实体
     * @return 服务器响应实体
     */
    Message login(User user);

    /**
     * 通过username获取用户实体
     * @param username 指定的username
     * @return 服务器响应实体
     */
    Message getUserByUsername(String username);

    /**
     * 更新用户诗句
     * @param user 更新之后的用户实体
     * @return 服务器响应实体
     */
    Message updateUserInfo(User user);

    /**
     * 获取所有的用户信息
     * @return 服务器响应实体
     */
    Message getAllUsers();
}
