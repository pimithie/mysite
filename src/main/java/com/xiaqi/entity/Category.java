package com.xiaqi.entity;

/**
 * 文章分类表
 * @author xiaqi
 */
public class Category {
    /**
     * 分类id
     */
    private Integer id;

    /**
     * 分类名称
     */
    private String catagoryName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatagoryName() {
        return catagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName == null ? null : catagoryName.trim();
    }
}