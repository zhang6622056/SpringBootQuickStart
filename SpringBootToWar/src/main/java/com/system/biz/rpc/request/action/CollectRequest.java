package com.system.biz.rpc.request.action;

/**
 * 收藏操作请求对象
 * Created by admin on 2018-08-27.
 */
public class CollectRequest {
    private Long userId;
    private Integer colType;    //1-故事 2-专辑
    private Long colId; //收藏ID


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getColType() {
        return colType;
    }

    public void setColType(Integer colType) {
        this.colType = colType;
    }

    public Long getColId() {
        return colId;
    }

    public void setColId(Long colId) {
        this.colId = colId;
    }
}
