package com.xiaqi.service.impl;

import com.xiaqi.entity.ArticleTag;
import com.xiaqi.entity.Tag;
import com.xiaqi.mapper.ArticleTagMapper;
import com.xiaqi.service.ArticleTagService;
import com.xiaqi.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaqi
 * @date 2019/8/19
 */
@Service
public class ArticleTagServiceImpl implements ArticleTagService {

    @Autowired
    private ArticleTagMapper articleTagMapper;

    @Autowired
    private TagService tagService;

    @Override
    public int addTagWithArticle(int tagId, long articleId) {
        return articleTagMapper.insert(new ArticleTag(articleId,tagId));
    }

    @Override
    public int removeTagWithArticle(int tagId, long articleId) {
        return articleTagMapper.delete(new ArticleTag(articleId,tagId));
    }

    @Override
    public List<Tag> selectAllTagsByArticleId(long articleId) {
        List<Integer> tags = articleTagMapper.getAllTagsByArticleId(articleId);
        List<Tag> list = new ArrayList<>();
        for (Integer i : tags) {
            list.add(tagService.selectTagById(i));
        }
        return list;
    }


}
