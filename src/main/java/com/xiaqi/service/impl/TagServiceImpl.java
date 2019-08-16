package com.xiaqi.service.impl;

import com.xiaqi.entity.Tag;
import com.xiaqi.mapper.TagMapper;
import com.xiaqi.service.TagService;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaqi
 * @date 2019/8/16
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public int addTag(Tag tag) {
        return tagMapper.insert(tag);
    }

    @Override
    public int deleteTagById(Integer tagId) {
        return tagMapper.deleteByPrimaryKey(tagId);
    }

    @Override
    public Tag selectTagById(Integer tagId) {
        return tagMapper.selectByPrimaryKey(tagId);
    }

    @Override
    public int updateTagById(Tag tag) {
        return tagMapper.updateByPrimaryKeySelective(tag);
    }

    @Override
    public List<Tag> getTagsByTagNameBlur(String tagName) {
        return tagMapper.getTagsByTagNameBlur(tagName);
    }
}
