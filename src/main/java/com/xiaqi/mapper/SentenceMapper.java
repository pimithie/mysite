package com.xiaqi.mapper;

import com.xiaqi.entity.Sentence;

/**
 * 每日一句Mapper
 * @author xiaqi
 */
public interface SentenceMapper {
    /**
     * 根据id删除句子
     * @param id 子句id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增每日一句
     * @param record 句子
     * @return 影响行数
     */
    int insert(Sentence record);

    /**
     * 根据id查询句子
     * @param id 子句id
     * @return 句子
     */
    Sentence selectByPrimaryKey(Integer id);

    /**
     * 根据id，选择性更新句子
     * @param record 更新句子的属性
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(Sentence record);

    /**
     * 根据id，更新句子
     * @param record 句子
     * @return 影响行数
     */
    int updateByPrimaryKey(Sentence record);
}