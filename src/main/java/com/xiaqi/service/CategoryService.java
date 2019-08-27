package com.xiaqi.service;

import com.xiaqi.entity.Category;

import java.util.List;

/**
 * 分类服务
 * @author xiaqi
 * @date 2019/8/27
 */
public interface CategoryService {

    /**
     * 增加一个分类
     * @param category 新增的分类
     * @return 影响行数
     */
    int addCategory(Category category);

    /**
     * 选择性更新一个分类
     * @param category  根据主键选择性的更新分类
     * @return 影响行数
     */
    int updateCategoryByIdSelective(Category category);

    /**
     * 根据主键删除一个分类
     * @param categoryId 分类id
     * @return 影响行数
     */
    int deleteCategoryById(int categoryId);

    /**
     * 查询所有的分类
     * @return 所有分类的列表
     */
    List<Category> selectAllCategory();

    /**
     * 根据分类id查询分类
     * @param categoryId 分类id
     * @return 对应分类
     */
    Category selectCategoryById(int categoryId);

    /**
     * 后模糊查询分类
     * @param prefix 分类名前缀
     * @return 分类列表
     */
    List<Category> selectCategoryByNamePostBlur(String prefix);

}
