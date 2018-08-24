package com.system.biz.rpc.response.main;

/**
 * 公益排行榜
 * Created by admin on 2018-08-24.
 */
public class MainLoveRankResponse {
    private Long id;
    private String nickname;
    private Integer loveCount;      //爱心值
    private String headImg;
    private Integer rank;       //排名


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getLoveCount() {
        return loveCount;
    }

    public void setLoveCount(Integer loveCount) {
        this.loveCount = loveCount;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
