package com.system.entity.story;

import java.util.Date;

/**
 * 故事VO
 * Created by admin on 2018-08-22.
 */
public class StoryVo {
    private Long id; 					//故事主键ID
    private String stTitle;			//标题
    private String stImg;			//标题图
    private Integer stTime;			//时长单位为S
    private Long userId;			//所属用户ID
    private String stDesc;			//简介
    private Long playCount;			//播放量
    private Long commentCount;		//评论总数
    private Long shareCount;		//分享总数
    private Long collectCount;		//收藏总数
    private String stHref;			//故事文件链接地址
    private Date pubTime;			//  发布时间
    private Integer xState;			//1-有效  2-无效


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStTitle() {
        return stTitle;
    }

    public void setStTitle(String stTitle) {
        this.stTitle = stTitle;
    }

    public String getStImg() {
        return stImg;
    }

    public void setStImg(String stImg) {
        this.stImg = stImg;
    }

    public Integer getStTime() {
        return stTime;
    }

    public void setStTime(Integer stTime) {
        this.stTime = stTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStDesc() {
        return stDesc;
    }

    public void setStDesc(String stDesc) {
        this.stDesc = stDesc;
    }

    public Long getPlayCount() {
        return playCount;
    }

    public void setPlayCount(Long playCount) {
        this.playCount = playCount;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public Long getShareCount() {
        return shareCount;
    }

    public void setShareCount(Long shareCount) {
        this.shareCount = shareCount;
    }

    public Long getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Long collectCount) {
        this.collectCount = collectCount;
    }

    public String getStHref() {
        return stHref;
    }

    public void setStHref(String stHref) {
        this.stHref = stHref;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public Integer getxState() {
        return xState;
    }

    public void setxState(Integer xState) {
        this.xState = xState;
    }
}
