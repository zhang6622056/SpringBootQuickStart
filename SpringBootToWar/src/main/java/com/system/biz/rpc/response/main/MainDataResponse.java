package com.system.biz.rpc.response.main;

import java.io.Serializable;
import java.util.List;

/**
 * 首页数据返回
 * Created by admin on 2018-08-24.
 */
public class MainDataResponse implements Serializable{
    private List<MainBannerResponse> mainBannerResponses;   //banner广告位
    private List<MainMarkResponse> mainMarkResponses;   //标签推荐
    private MainUserResponse mainUserResponse;  //用户明星推荐版块
    private MainBLockResponse mainBLockResponse;    //故事模块推荐
    private List<MainRecommendResponse> mainRecommendResponses; //今日专辑故事推荐
    private List<MainMarkResponse> listNineMarks;       //九宫格推荐
    private List<MainLoveRankResponse> mainLoveRankResponses;   //公益榜单


    public List<MainBannerResponse> getMainBannerResponses() {
        return mainBannerResponses;
    }

    public void setMainBannerResponses(List<MainBannerResponse> mainBannerResponses) {
        this.mainBannerResponses = mainBannerResponses;
    }

    public List<MainMarkResponse> getMainMarkResponses() {
        return mainMarkResponses;
    }

    public void setMainMarkResponses(List<MainMarkResponse> mainMarkResponses) {
        this.mainMarkResponses = mainMarkResponses;
    }

    public MainUserResponse getMainUserResponse() {
        return mainUserResponse;
    }

    public void setMainUserResponse(MainUserResponse mainUserResponse) {
        this.mainUserResponse = mainUserResponse;
    }

    public MainBLockResponse getMainBLockResponse() {
        return mainBLockResponse;
    }

    public void setMainBLockResponse(MainBLockResponse mainBLockResponse) {
        this.mainBLockResponse = mainBLockResponse;
    }

    public List<MainRecommendResponse> getMainRecommendResponses() {
        return mainRecommendResponses;
    }

    public void setMainRecommendResponses(List<MainRecommendResponse> mainRecommendResponses) {
        this.mainRecommendResponses = mainRecommendResponses;
    }

    public List<MainMarkResponse> getListNineMarks() {
        return listNineMarks;
    }

    public void setListNineMarks(List<MainMarkResponse> listNineMarks) {
        this.listNineMarks = listNineMarks;
    }

    public List<MainLoveRankResponse> getMainLoveRankResponses() {
        return mainLoveRankResponses;
    }

    public void setMainLoveRankResponses(List<MainLoveRankResponse> mainLoveRankResponses) {
        this.mainLoveRankResponses = mainLoveRankResponses;
    }
}
