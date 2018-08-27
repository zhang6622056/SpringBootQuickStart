package com.system.entity.action;

import java.util.Date;

/**
 * 动态
 * Created by admin on 2018-08-25.
 */
public class DynamicVo {
    private Long id;        //动态ID
    private Date createTime;    //创建时间
    private Long userId;        //用户ID
    private String dyText;      //动态详情
    private String title;       //动态标题
    private Integer dyType;     //动态类型 1-关注动态
    private Long href;      //  配合类型，跳转目标
    private String icon;    //动态图


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDyText() {
        return dyText;
    }

    public void setDyText(String dyText) {
        this.dyText = dyText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDyType() {
        return dyType;
    }

    public void setDyType(Integer dyType) {
        this.dyType = dyType;
    }

    public Long getHref() {
        return href;
    }

    public void setHref(Long href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
