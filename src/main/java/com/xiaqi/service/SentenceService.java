package com.xiaqi.service;

import com.xiaqi.entity.Sentence;

/**
 * 每日一句service接口定义
 * @author xiaqi
 * @date 2019/8/23
 */
public interface SentenceService {
    /**
     * 添加一句
     * @param sentence 添加的sentence实例
     * @return 影响行数
     */
    int addSentence(Sentence sentence);

    /**
     * 根据主键删除句子
     * @param sentenceId 句子id
     * @return 影响行数
     */
    int deleteSentenceById(int sentenceId);

    /**
     * 根据主键id更新句子
     * @param sentence 更新的句子实例
     * @return 影响行数
     */
    int updateSentenceById(Sentence sentence);

    /**
     * 根据句子id查询句子
     * @param sentenceId 句子id
     * @return 句子实例
     */
    Sentence selectSentenceById(int sentenceId);
}
