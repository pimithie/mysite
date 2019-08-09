package com.xiaqi.entity;

import java.util.Date;

/**
 * 用户实体类
 * @author xiaqi
 */
public class User {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户们
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像URL路径
     */
    private String headPicture;

    /**
     * 个性签名
     */
    private String personalSignature;

    /**
     * 当前所在地
     */
    private String currentResidence;

    /**
     * 生日
     */
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHeadPicture() {
        return headPicture;
    }

    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture == null ? null : headPicture.trim();
    }

    public String getPersonalSignature() {
        return personalSignature;
    }

    public void setPersonalSignature(String personalSignature) {
        this.personalSignature = personalSignature == null ? null : personalSignature.trim();
    }

    public String getCurrentResidence() {
        return currentResidence;
    }

    public void setCurrentResidence(String currentResidence) {
        this.currentResidence = currentResidence == null ? null : currentResidence.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", headPicture='" + headPicture + '\'' +
                ", personalSignature='" + personalSignature + '\'' +
                ", currentResidence='" + currentResidence + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}