package com.xiaqi.test;

import com.xiaqi.entity.Tag;
import com.xiaqi.service.TagService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xiaqi
 * @date 2019/8/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTagService {

    @Autowired
    private TagService tagService;

    @Test
    public void test() {
        System.out.println(tagService.getTagsByTagNameBlur("spr"));
    }
}
