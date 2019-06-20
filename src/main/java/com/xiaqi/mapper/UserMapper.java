package com.xiaqi.mapper;

import com.xiaqi.entity.User;

import java.util.List;

/**
 * @author xiaqi
 * @date 2019/6/20
 */
public interface UserMapper {

    public List<User> findAll();
}
