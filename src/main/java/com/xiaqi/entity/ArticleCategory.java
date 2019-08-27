package com.xiaqi.entity;

import java.util.Objects;

/**
 * 文章分类实体
 */
public class ArticleCategory {
    /**
     * 文章id
     */
    private Long articleId;

    /**
     * 分类id
     */
    private Integer categoryId;

    public ArticleCategory() {
    }

    public ArticleCategory(Long articleId, Integer categoryId) {
        this.articleId = articleId;
        this.categoryId = categoryId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "ArticleCategory{" +
                "articleId=" + articleId +
                ", categoryId=" + categoryId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ArticleCategory that = (ArticleCategory) o;
        return Objects.equals(articleId, that.articleId) &&
                Objects.equals(categoryId, that.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, categoryId);
    }
}