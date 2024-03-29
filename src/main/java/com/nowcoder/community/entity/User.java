package com.nowcoder.community.entity;

import java.util.Date;

public class User {
    private int id;
    private String username;
    private String passwordl;
    private String salt;
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date createtime;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username='" + username + '\'' + ", passwordl='" + passwordl + '\'' + ", salt='" + salt + '\'' + ", email='" + email + '\'' + ", type=" + type + ", status=" + status + ", activationCode='" + activationCode + '\'' + ", headerUrl='" + headerUrl + '\'' + ", createtime=" + createtime + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordl() {
        return passwordl;
    }

    public void setPasswordl(String passwordl) {
        this.passwordl = passwordl;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public String getHeaderUrl() {
        return headerUrl;
    }

    public void setHeaderUrl(String headerUrl) {
        this.headerUrl = headerUrl;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
