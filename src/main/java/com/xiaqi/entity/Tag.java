package com.xiaqi.entity;

import java.util.Objects;

/**
 * 文章标签实体
 * @author xiaqi
 */
public class Tag {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 标签名
     */
    private String tagName;

    /**
     * 是否热门
     * 0：否
     * 1：是
     */
    private Byte isHot;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tag tag = (Tag) o;
        return Objects.equals(id, tag.id) &&
                Objects.equals(tagName, tag.tagName) &&
                Objects.equals(isHot, tag.isHot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tagName, isHot);
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", tagName='" + tagName + '\'' +
                ", isHot=" + isHot +
                '}';
    }
}