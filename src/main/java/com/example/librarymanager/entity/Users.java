package com.example.librarymanager.entity;

import org.apache.ibatis.type.Alias;

@Alias("Users")
public class Users {
    private Integer userId;
    private String userName;
    private Integer userAge;
    private Gender userGender;

    public Integer getUserId() {
        return userId;
    }

    public Users(String userName, Integer userAge, Gender userGender, String userPhone, String userPwd, String userCard) {
        this.userName = userName;
        this.userAge = userAge;
        this.userGender = userGender;
        this.userPhone = userPhone;
        this.userPwd = userPwd;
        this.userCard = userCard;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Gender getUserGender() {
        return userGender;
    }

    public void setUserGender(Gender userGender) {
        this.userGender = userGender;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    private String userPhone;
    private String userPwd;
    private String userCard;

}

