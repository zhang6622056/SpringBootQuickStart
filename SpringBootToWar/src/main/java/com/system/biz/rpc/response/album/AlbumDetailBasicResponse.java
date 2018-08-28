package com.system.biz.rpc.response.album;

import java.util.Date;

/**
 * Created by admin on 2018-08-27.
 */
public class AlbumDetailBasicResponse {
    private Long id;
    private String title;
    private String intro;
    private String headImg;
    private Long userId;
    private Date createTime;
    private Date lastUpdateTime;
    private Integer stCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
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

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getStCount() {
        return stCount;
    }

    public void setStCount(Integer stCount) {
        this.stCount = stCount;
    }
}
