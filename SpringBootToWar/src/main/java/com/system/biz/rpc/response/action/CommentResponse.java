package com.system.biz.rpc.response.action;

import java.util.Date;

/**
 * 评论列表返回
 * Created by admin on 2018-08-31.
 */
public class CommentResponse {

    private Long id;
    private String commentText; //'评论文案'
    private Long storyId;       //'故事ID'
    private Long userId;        //用户ID
    private Date commentTime;   //评论时间
    private Integer xState;     //状态 1-有效 2无效
    private Integer commentType;    //评论类型 1-文本评论  2-语音评论
    private String commentHref; //如果是语音评论，此字段则保存语音评论地址


    private String nickname; //用户昵称
    private String headImg;     //用户头像



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Long getStoryId() {
        return storyId;
    }

    public void setStoryId(Long storyId) {
        this.storyId = storyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getxState() {
        return xState;
    }

    public void setxState(Integer xState) {
        this.xState = xState;
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    public String getCommentHref() {
        return commentHref;
    }

    public void setCommentHref(String commentHref) {
        this.commentHref = commentHref;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getHeadImg() {
        return headImg;
    }
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }




}