package com.xiaqi.entity;

import java.util.Date;

/**
 * 文章实体类
 * @author xiaqi
 */
public class Article {
    /**
     * 文章id
     */
    private Long id;

    /**
     * 所属用户的id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 上次修改时间
     */
    private Date lastModifiedTime;

    /**
     * 上次发布时间
     */
    private Date lastPublishTime;

    /**
     * 阅读量
     */
    private Integer viewTimes;

    /**
     * 点赞数
     */
    private Integer awesome;

    /**
     * 主题
     */
    private String title;

    /**
     * 子主题
     */
    private String subTitle;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 是否私有，不公开
     */
    private Byte isPrivate;

    /**
     * 文章封面图
     */
    private String image;

    /**
     * TODO：文章与分类为多对多关系，需建立第三张表
     */
    private Long catagoryId;

    /**
     * 是否为热门文章
     */
    private Byte isHot;

    /**
     * 是否置顶
     */
    private Byte isTop;

    /**
     * 文章内容
     */
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Date getLastPublishTime() {
        return lastPublishTime;
    }

    public void setLastPublishTime(Date lastPublishTime) {
        this.lastPublishTime = lastPublishTime;
    }

    public Integer getViewTimes() {
        return viewTimes;
    }

    public void setViewTimes(Integer viewTimes) {
        this.viewTimes = viewTimes;
    }

    public Integer getAwesome() {
        return awesome;
    }

    public void setAwesome(Integer awesome) {
        this.awesome = awesome;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Byte getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Byte isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Long getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(Long catagoryId) {
        this.catagoryId = catagoryId;
    }

    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    public Byte getIsTop() {
        return isTop;
    }

    public void setIsTop(Byte isTop) {
        this.isTop = isTop;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", lastModifiedTime=" + lastModifiedTime +
                ", lastPublishTime=" + lastPublishTime +
                ", viewTimes=" + viewTimes +
                ", awesome=" + awesome +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", introduction='" + introduction + '\'' +
                ", isPrivate=" + isPrivate +
                ", image='" + image + '\'' +
                ", catagoryId=" + catagoryId +
                ", isHot=" + isHot +
                ", isTop=" + isTop +
                ", content='" + content + '\'' +
                '}';
    }
}