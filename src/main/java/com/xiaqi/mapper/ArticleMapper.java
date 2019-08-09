package com.xiaqi.mapper;

import com.xiaqi.entity.Article;

/**
 * 文章dao
 * @author xiaqi
 */
public interface ArticleMapper {
    /**
     * 根据文章id删除文章
     * @param id 文字id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 增加一篇文章
     * @param record 指定文章
     * @return 影响行数
     */
    int insert(Article record);

    /**
     * 根据文章id查询文章
     * @param id 指定文章id
     * @return 文章实体
     */
    Article selectByPrimaryKey(Long id);

    /**
     * 根据文章id选择性的更新文章
     * @param record 需更新的文章属性，不更新就置为null
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     * 根据文章id更新文章，包含文章内容content
     * @param record 更新之后的文章实体
     * @return 影响行数
     */
    int updateByPrimaryKeyWithBLOBs(Article record);

    /**
     * 根据文章id更新文章，不包含文章内容content
     * @param record 更新之后的文章实体
     * @return 影响行数
     */
    int updateByPrimaryKey(Article record);
}