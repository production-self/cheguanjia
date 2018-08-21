package com.cheguanjia.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "nick_name")
    private String nickName;
    @Column(name = "telphone_number")
    private String telphoneNumber;
    @Column(name = "driving_license")
    private String drivingLicense;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTelphoneNumber() {
        return telphoneNumber;
    }

    public void setTelphoneNumber(String telphoneNumber) {
        this.telphoneNumber = telphoneNumber;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    @Override
    public String toString() {
        return userId + "userId," + userName + "userName," + nickName + "nickName," + telphoneNumber
                + "telphoneNumber," + drivingLicense + "drivingLicense,";
    }
}
