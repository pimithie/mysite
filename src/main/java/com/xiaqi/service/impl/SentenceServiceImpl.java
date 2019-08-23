package com.xiaqi.service.impl;

import com.xiaqi.entity.Sentence;
import com.xiaqi.mapper.SentenceMapper;
import com.xiaqi.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaqi
 * @date 2019/8/23
 */
@Service
public class SentenceServiceImpl implements SentenceService {

    @Autowired
    private SentenceMapper sentenceMapper;

    @Override
    public int addSentence(Sentence sentence) {
        return sentenceMapper.insert(sentence);
    }

    @Override
    public int deleteSentence(int sentenceId) {
        return sentenceMapper.deleteByPrimaryKey(sentenceId);
    }

    @Override
    public int updateSentence(Sentence sentence) {
        return sentenceMapper.updateByPrimaryKeySelective(sentence);
    }

    @Override
    public Sentence selectSentenceById(int sentenceId) {
        return sentenceMapper.selectByPrimaryKey(sentenceId);
    }
}
