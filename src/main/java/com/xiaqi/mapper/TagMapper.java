package com.xiaqi.mapper;

import com.xiaqi.entity.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 标签Mapper
 * @author xiaqi
 */
public interface TagMapper {
    /**
     * 根据主键删除标签
     * @param id 指定id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增一个标签
     * @param record 指定标签记录
     * @return 影响行数
     */
    int insert(Tag record);

    /**
     * 根据主键查询标签
     * @param id 指定id
     * @return 标签实体
     */
    Tag selectByPrimaryKey(Integer id);

    /**
     * 选择性更新标签
     * @param record 更新记录
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(Tag record);

    /**
     * 更新标签
     * @param record 更新记录
     * @return 影响行数
     */
    int updateByPrimaryKey(Tag record);

    /**
     * 根据标签名后模糊查询标签
     * @param tagName 指定标签id
     * @return 标签列表
     */
    List<Tag> getTagsByTagNameBlur(@Param("tagName") String tagName);
}