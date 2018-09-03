package com.system.biz.rpc.request.album;

/**
 * 获取专辑收藏列表
 * Created by admin on 2018-08-30.
 */
public class AlbumCollectRequest {
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
