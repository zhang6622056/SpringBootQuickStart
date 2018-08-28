package com.system.biz.rpc.response.album;

import java.util.List;

/**
 * Created by admin on 2018-08-27.
 */
public class AlbumDetailResponse {

    private AlbumDetailBasicResponse albumDetailBasicResponse;  //基础信息
    private List<AlbumDetailStoryResponse> albumDetailStoryResponseList;    //故事列表
    private Long storyCount;        //分页故事总数



    public AlbumDetailBasicResponse getAlbumDetailBasicResponse() {
        return albumDetailBasicResponse;
    }

    public void setAlbumDetailBasicResponse(AlbumDetailBasicResponse albumDetailBasicResponse) {
        this.albumDetailBasicResponse = albumDetailBasicResponse;
    }

    public List<AlbumDetailStoryResponse> getAlbumDetailStoryResponseList() {
        return albumDetailStoryResponseList;
    }

    public void setAlbumDetailStoryResponseList(List<AlbumDetailStoryResponse> albumDetailStoryResponseList) {
        this.albumDetailStoryResponseList = albumDetailStoryResponseList;
    }

    public Long getStoryCount() {
        return storyCount;
    }

    public void setStoryCount(Long storyCount) {
        this.storyCount = storyCount;
    }
}
