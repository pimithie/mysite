package com.xiaqi.entity;

import java.util.Objects;

/**
 * 文章-标签映射
 * @author xiaqi
 */
public class ArticleTag {
    /**
     * 文章id
     */
    private Long articleId;

    /**
     * 标签id
     */
    private Integer tagId;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    @Override
    public String toString() {
        return "ArticleTag{" +
                "articleId=" + articleId +
                ", tagId=" + tagId +
                '}';
    }

    public ArticleTag(Long articleId, Integer tagId) {
        this.articleId = articleId;
        this.tagId = tagId;
    }

    public ArticleTag() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ArticleTag that = (ArticleTag) o;
        return Objects.equals(articleId, that.articleId) &&
                Objects.equals(tagId, that.tagId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, tagId);
    }
}