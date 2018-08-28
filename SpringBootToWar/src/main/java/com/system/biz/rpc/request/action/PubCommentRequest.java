package com.system.biz.rpc.request.action;

/**
 * Created by admin on 2018-08-27.
 */
public class PubCommentRequest {
    private Long storyId;
    private String commentText;
    private Integer commentType;    //评论类型 1-文本评论  2-语音评论
    private Long userId;


    public Long getStoryId() {
        return storyId;
    }

    public void setStoryId(Long storyId) {
        this.storyId = storyId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
