package com.xiaqi.test;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xiaqi.entity.User;
import com.xiaqi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author xiaqi
 * @date 2019/6/20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMybatisSpring {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> list = userMapper.findAll();
        System.out.println(list);
    }

    @Test
    public void testInsert() throws ParseException {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        user.setNickname("xiaqi");
        user.setHeadPicture("/a.png");
        user.setPersonalSignature("stay foolish,stay hungry");
        user.setCurrentResidence("jx,nc");
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("1998-08-25");
        user.setBirthday(date);
        userMapper.insert(user);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(1);
        user.setNickname("夏齐");
        userMapper.updateByPrimaryKeySelective(user);
    }
}
