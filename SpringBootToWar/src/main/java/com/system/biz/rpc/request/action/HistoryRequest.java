package com.system.biz.rpc.request.action;

/**
 * 记录最近播放
 * Created by admin on 2018-08-27.
 */
public class HistoryRequest {

    private Long userId;
    private Long hrefId;        //故事ID或者专辑ID
    private Integer playType;   //播放类型 1-故事 2-专辑



    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getHrefId() {
        return hrefId;
    }

    public void setHrefId(Long hrefId) {
        this.hrefId = hrefId;
    }

    public Integer getPlayType() {
        return playType;
    }

    public void setPlayType(Integer playType) {
        this.playType = playType;
    }
}
