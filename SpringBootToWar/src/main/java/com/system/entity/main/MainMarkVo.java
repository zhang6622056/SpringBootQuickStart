package com.system.entity.main;

import java.util.Date;

/**
 * 主页-banner下方的标签配置表
 * Created by admin on 2018-08-22.
 */
public class MainMarkVo {


    private Long id;
    private Long markId;        //标签ID
    private String bgImg;       //背景图
    private Integer xState;     //1-有效  2-无效
    private Integer orderPriority;  //排序权重，数越大则越靠前
    private Date createDate;    //创建时间


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMarkId() {
        return markId;
    }

    public void setMarkId(Long markId) {
        this.markId = markId;
    }

    public String getBgImg() {
        return bgImg;
    }

    public void setBgImg(String bgImg) {
        this.bgImg = bgImg;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
