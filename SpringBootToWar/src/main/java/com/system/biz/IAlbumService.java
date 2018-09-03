package com.system.biz;

import com.system.biz.rpc.common.JsonResult;
import com.system.biz.rpc.request.album.AlbumCollectRequest;
import com.system.biz.rpc.request.album.AlbumDetailRequest;
import com.system.biz.rpc.response.album.AlbumDetailResponse;

/**
 * Created by admin on 2018-08-27.
 */
public interface IAlbumService {


    /***
     * 获取album 详情
     * @param albumDetailRequest
     * @return
     */
    JsonResult getAlbumDetail(AlbumDetailRequest albumDetailRequest);
    /***
     * 获取收藏专辑列表
     * @param albumCollectRequest
     * @return
     */
    JsonResult getCollectAlbumList(AlbumCollectRequest albumCollectRequest);

}
