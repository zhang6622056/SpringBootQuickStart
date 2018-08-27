package com.system.biz.rpc.request.action;

/**
 * Created by admin on 2018-08-26.
 */
public class DynamicRequest {

    private Long userId;
    private Integer start;
    private Integer size;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
