package com.system.biz.rpc.request.action;

/**
 * 关注动作请求
 * Created by admin on 2018-08-26.
 */
public class DoAttentionRequest {

    private Long userId;        //关注用户
    private Long toUserId;      //被关注用户

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }
}
