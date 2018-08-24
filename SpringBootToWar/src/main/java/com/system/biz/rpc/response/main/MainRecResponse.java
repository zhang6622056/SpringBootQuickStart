package com.system.biz.rpc.response.main;

/**
 * 今日推荐
 * Created by admin on 2018-08-24.
 */
public class MainRecResponse {
    private Long id;
    private String title;   //标题
    private String image;       //图片地址
    private Integer numCou;     //如果是专辑的话，则有用
    private Integer recType;    //1-专辑  2-故事
    private Integer xState;     //1-生效  2-未生效

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

    public Integer getxState() {
        return xState;
    }

    public void setxState(Integer xState) {
        this.xState = xState;
    }
}
