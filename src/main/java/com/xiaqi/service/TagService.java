package com.xiaqi.service;

import com.xiaqi.entity.Tag;

import java.util.List;

/**
 * @author xiaqi
 * @date 2019/8/16
 */
public interface TagService {

    /**
     * 新增一个标签
     * @param tag 指定标签
     * @return 影响行数
     */
    int addTag(Tag tag);

    /**
     * 删除一个标签
     * @param tagId 指定标签id
     * @return 影响行数
     */
    int deleteTagById(Integer tagId);

    /**
     * 查询一个标签
     * @param tagId 指定标签id
     * @return 标签实体
     */
    Tag selectTagById(Integer tagId);

    /**
     * 更新一个标签
     * @param tag 指定标签id
     * @return 影响行数
     */
    int updateTagById(Tag tag);

    /**
     * 根据标签名后模糊查询标签
     * @param tagName 指定标签id
     * @return 标签列表
     */
    List<Tag> getTagsByTagNameBlur(String tagName);

}
