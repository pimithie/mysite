package com.xiaqi.mapper;

import com.xiaqi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户dao
 * @author xiaqi
 */
public interface UserMapper {

    /**
     * 查找所有用户
     * @return 用户实体的List
     */
    List<User> findAll();

    /**
     * 根据主键删除用户
     * @param id 指定id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 增加一个用户
     * @param record 指定用户
     * @return 影响行数
     */
    int insert(User record);

    /**
     * 根据主键查询用户
     * @param id 指定id
     * @return 影响行数
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 根据主键选择性地更新用户
     * @param record 更新的用户属性，不更新置为null
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 更新用户信息
     * @param record 指定用户
     * @return 影响行数
     */
    int updateByPrimaryKey(User record);

    /**
     * 根据用户名查询用户
     * @param username 指定的用户名
     * @return 用户列表
     */
    List<User> getUsersByUsername(String username);

    /**
     * 根据用户名和密码查询用户
     * @param username 指定用户名
     * @param password 指定密码
     * @return 用户实体，or null
     */
    User getUserByUsernameAndPassword(@Param("username") String username,
                                      @Param("password") String password);
}