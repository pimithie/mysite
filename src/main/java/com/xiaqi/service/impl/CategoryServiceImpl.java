package com.xiaqi.service.impl;

import com.xiaqi.entity.Category;
import com.xiaqi.mapper.CategoryMapper;
import com.xiaqi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 分类服务实现类
 * @author xiaqi
 * @date 2019/8/27
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public int addCategory(Category category) {
        return categoryMapper.insert(category);
    }

    @Override
    public int updateCategoryByIdSelective(Category category) {
        return categoryMapper.updateByPrimaryKeySelective(category);
    }

    @Override
    public int deleteCategoryById(int categoryId) {
        return categoryMapper.deleteByPrimaryKey(categoryId);
    }

    @Override
    public List<Category> selectAllCategory() {
        return categoryMapper.selectAllCategory();
    }

    @Override
    public Category selectCategoryById(int categoryId) {
        return categoryMapper.selectByPrimaryKey(categoryId);
    }

    @Override
    public List<Category> selectCategoryByNamePostBlur(String prefix) {
        return categoryMapper.selectCategoryByNamePostBlur(prefix+'%');
    }
}
