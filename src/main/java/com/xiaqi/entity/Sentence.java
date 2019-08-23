package com.xiaqi.entity;

import java.util.Objects;

/**
 * 每日一句
 * @author xiaqi
 */
public class Sentence {
    private Integer id;

    private String content;

    private Byte isShow;

    private Integer priority;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", isShow=" + isShow +
                ", priority=" + priority +
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
        Sentence sentence = (Sentence) o;
        return Objects.equals(id, sentence.id) &&
                Objects.equals(content, sentence.content) &&
                Objects.equals(isShow, sentence.isShow) &&
                Objects.equals(priority, sentence.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, isShow, priority);
    }
}