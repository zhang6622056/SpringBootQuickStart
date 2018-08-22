package com.system.entity.main;

import java.util.Date;

/**
 * 主页-广告牌
 * Created by Nero on 2018-08-22.
 */
public class MainBannerVo {
    private Long id;
    private String banTitle;        //标题
    private String banIntro;       //简介
    private String banImg;          //封面图
    private String banHref;         //当ban_type为具体类型时为ID，为web时，则为具体地址
    private Integer banType;         //指向类型：1-故事  2-专辑  3-web
    private Date createTime;        //创建时间
    private Integer xState;         //1-有效  2-无效
    private Integer orderPriority;  //排序权重，越大排序越靠前

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

    public Integer getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(Integer orderPriority) {
        this.orderPriority = orderPriority;
    }
}
