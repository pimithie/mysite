package com.xiaqi.entity;

import java.util.Date;
import java.util.Objects;

/**
 * 评论实体
 * @xiaqi
 */
public class Comment {
    /**
     * id
     */
    private Integer id;

    /**
     * 所属文章id
     */
    private Long articleId;

    /**
     * 发布时间
     */
    private Date publishTime;

    /**
     * 发布者id，参照userId
     */
    private Integer publishId;

    /**
     * 赞
     */
    private Long up;

    /**
     * 踩
     */
    private Long down;

    /**
     * 是否置顶，0：否，1：是
     */
    private Byte isTop;

    /**
     * 是否删除，0：否，1：是
     * 逻辑删除
     */
    private Byte isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getPublishId() {
        return publishId;
    }

    public void setPublishId(Integer publishId) {
        this.publishId = publishId;
    }

    public Long getUp() {
        return up;
    }

    public void setUp(Long up) {
        this.up = up;
    }

    public Long getDown() {
        return down;
    }

    public void setDown(Long down) {
        this.down = down;
    }

    public Byte getIsTop() {
        return isTop;
    }

    public void setIsTop(Byte isTop) {
        this.isTop = isTop;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Comment comment = (Comment) o;
        return Objects.equals(id, comment.id) &&
                Objects.equals(articleId, comment.articleId) &&
                Objects.equals(publishTime, comment.publishTime) &&
                Objects.equals(publishId, comment.publishId) &&
                Objects.equals(up, comment.up) &&
                Objects.equals(down, comment.down) &&
                Objects.equals(isTop, comment.isTop) &&
                Objects.equals(isDelete, comment.isDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, articleId, publishTime, publishId, up, down, isTop, isDelete);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", publishTime=" + publishTime +
                ", publishId=" + publishId +
                ", up=" + up +
                ", down=" + down +
                ", isTop=" + isTop +
                ", isDelete=" + isDelete +
                '}';
    }
}