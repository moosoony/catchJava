/*
CREATE TABLE `user` (
        `id` bigint NOT NULL AUTO_INCREMENT,
        `username` varchar(45) DEFAULT NULL,
        `userid` varchar(45) DEFAULT NULL,
        `nickname` varchar(45) DEFAULT NULL,
        `password` varchar(45) DEFAULT NULL,
        `phonenumber` varchar(45) DEFAULT NULL,
        `postnumber` varchar(45) DEFAULT NULL,
        `address1` varchar(250) DEFAULT NULL,
        `address2` varchar(250) DEFAULT NULL,
        `birthday` varchar(45) DEFAULT NULL,
        `sex` varchar(45) DEFAULT NULL,
        `role` varchar(45) DEFAULT NULL,
        PRIMARY KEY (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
*/
package com.moo.catchjava.DTO;


public class UserDTO {
    private Long id;
    private String userid;
    private String nickname;
    private String password;
    private String email;
    private String username;
    private String phonenumber;
    private String zipcode;
    private String address1;
    private String address2;
    private String birthday;
    private String sex;
    private String regdate;
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", regdate='" + regdate + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
