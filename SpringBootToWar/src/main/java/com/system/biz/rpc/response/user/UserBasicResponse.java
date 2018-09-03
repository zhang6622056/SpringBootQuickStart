package com.system.biz.rpc.response.user;

/**
 * 用户基本信息返回
 * Created by admin on 2018-08-31.
 */
public class UserBasicResponse {
    private Long id;
    private String headImg;     //头像地址
    private String email;       //邮箱
    private String mobile;      //电话
    private String password;        //密码


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
