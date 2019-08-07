package com.xiaqi.mapper;

import com.xiaqi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getUsersByUsername(String username);

    User getUserByUsernameAndPassword(@Param("username") String username,
                                      @Param("password") String password);
}