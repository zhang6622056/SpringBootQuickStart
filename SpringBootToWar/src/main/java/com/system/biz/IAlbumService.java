package com.system.biz;

import com.system.biz.rpc.common.JsonResult;
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
}
