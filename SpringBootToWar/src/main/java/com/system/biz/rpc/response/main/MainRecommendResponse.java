package com.system.biz.rpc.response.main;

/**
 * 今日推荐
 * Created by admin on 2018-08-24.
 */
public class MainRecommendResponse {
    private Long id;
    private String title;
    private String image;
    private Integer numCou;      //专辑包含数量
    private Integer recType;    //推荐类型1-专辑  2-故事
    private Long recHref;      //推荐ID

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getNumCou() {
        return numCou;
    }

    public void setNumCou(Integer numCou) {
        this.numCou = numCou;
    }

    public Integer getRecType() {
        return recType;
    }

    public void setRecType(Integer recType) {
        this.recType = recType;
    }

    public Long getRecHref() {
        return recHref;
    }

    public void setRecHref(Long recHref) {
        this.recHref = recHref;
    }
}
