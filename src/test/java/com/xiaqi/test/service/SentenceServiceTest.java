package com.xiaqi.test.service;

import com.xiaqi.entity.Sentence;
import com.xiaqi.service.SentenceService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author xiaqi
 * @date 2019/9/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SentenceServiceTest {

    @Autowired
    private SentenceService sentenceService;

    @Test
    public void testAddSentence() {
        Sentence sentence = new Sentence();
        sentence.setContent("xxx");
        sentence.setIsShow((byte)0);
        sentence.setPriority(0);
        Assert.assertEquals(1L,sentenceService.addSentence(sentence));
    }

    @Test
    public void testDeleteSentenceById() {
        Assert.assertEquals(1L,sentenceService.deleteSentenceById(1));
    }

    @Test
    public void testUpdateSentenceById() {
        Sentence sentence = new Sentence();
        sentence.setId(1);
        sentence.setContent("yyy");
        Assert.assertEquals(1L,sentenceService.updateSentenceById(sentence));
    }

    @Test
    public void testSelectSentenceById() {
        Sentence sentence = sentenceService.selectSentenceById(1);
        System.out.println(sentence);
    }
}
