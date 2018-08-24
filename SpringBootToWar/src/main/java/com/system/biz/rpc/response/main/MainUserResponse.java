package com.system.biz.rpc.response.main;

import java.io.Serializable;

/**
 * Created by admin on 2018-08-24.
 */
public class MainUserResponse implements Serializable{

    private Long userId;
    private String nickname;        //昵称
    private String realname;        //真是姓名
    private String remark;         //备注
    private String headImg;     //头像

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }
}
