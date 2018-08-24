package com.system.biz.rpc.response.main;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2018-08-24.
 */
public class MainBannerResponse implements Serializable{
    private Long id;
    private String banTitle;        //标题
    private String banIntro;       //简介
    private String banImg;          //封面图
    private String banHref;         //当ban_type为具体类型时为ID，为web时，则为具体地址
    private Integer banType;         //指向类型：1-故事  2-专辑  3-web
    private Date createTime;        //创建时间
    private Integer xState;         //1-有效  2-无效

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBanTitle() {
        return banTitle;
    }

    public void setBanTitle(String banTitle) {
        this.banTitle = banTitle;
    }

    public String getBanIntro() {
        return banIntro;
    }

    public void setBanIntro(String banIntro) {
        this.banIntro = banIntro;
    }

    public String getBanImg() {
        return banImg;
    }

    public void setBanImg(String banImg) {
        this.banImg = banImg;
    }

    public String getBanHref() {
        return banHref;
    }

    public void setBanHref(String banHref) {
        this.banHref = banHref;
    }

    public Integer getBanType() {
        return banType;
    }

    public void setBanType(Integer banType) {
        this.banType = banType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getxState() {
        return xState;
    }

    public void setxState(Integer xState) {
        this.xState = xState;
    }
}
