package com.xiaqi.service.impl;

import com.xiaqi.entity.ArticleCategory;
import com.xiaqi.entity.Category;
import com.xiaqi.mapper.ArticleCategoryMapper;
import com.xiaqi.service.ArticleCategoryService;
import com.xiaqi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaqi
 * @date 2019/8/27
 */
@Service
public class ArticleCategoryServiceImpl implements ArticleCategoryService {

    @Autowired
    private ArticleCategoryMapper articleCategoryMapper;

    @Autowired
    private CategoryService categoryService;

    @Override
    public int addCategoryWithArticle(int categoryId, long articleId) {
        return articleCategoryMapper.insert(new ArticleCategory(articleId,categoryId));
    }

    @Override
    public int deleteCategoryWithArticle(int categoryId, long articleId) {
        return articleCategoryMapper.deleteCategoryWithArticle(categoryId,articleId);
    }

    @Override
    public List<Category> selectAllCategoryByArticleId(long articleId) {
        List<Integer> categoryIds = articleCategoryMapper.selectAllCategoryByArticleId(articleId);
        List<Category> res = new ArrayList<>();
        for (Integer categoryId : categoryIds) {
            res.add(categoryService.selectCategoryById(categoryId));
        }
        return res;
    }
}
