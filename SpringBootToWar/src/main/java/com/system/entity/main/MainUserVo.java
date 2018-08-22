package com.system.entity.main;

import java.util.Date;

/**
 * 主页-用户推荐表
 * Created by admin on 2018-08-22.
 */
public class MainUserVo {
    private Long id;
    private Long userId;
    private Date createTime;
    private Integer orderPriority;  //排序优先级，数越大，越靠前
    private Integer xState;         //1-有效 2-无效

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(Integer orderPriority) {
        this.orderPriority = orderPriority;
    }

    public Integer getxState() {
        return xState;
    }

    public void setxState(Integer xState) {
        this.xState = xState;
    }
}
