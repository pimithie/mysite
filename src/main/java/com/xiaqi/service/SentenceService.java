package com.xiaqi.service;

import com.xiaqi.entity.Sentence;

/**
 * @author xiaqi
 * @date 2019/8/23
 */
public interface SentenceService {

    int addSentence(Sentence sentence);

    int deleteSentence(int sentenceId);

    int updateSentence(Sentence sentence);

    Sentence selectSentenceById(int sentenceId);
}
