package com.system.mapper.album;

import com.system.biz.rpc.response.album.AlbumDetailBasicResponse;
import com.system.biz.rpc.response.album.AlbumDetailStoryResponse;

import java.util.List;
import java.util.Map;

/**
 *专辑相关
 * Created by Nero on 2018-08-22.
 */
public interface AlbumMapper {
    /***
     * 获取专辑详情
     * @param condition
     * @return
     */
    AlbumDetailBasicResponse getAlbumById(Map condition);

    /***
     * 获取专辑故事详情
     * @param condition
     * @return
     */
    List<AlbumDetailStoryResponse> getAlbumStoryById(Map condition);
    /***
     * 获取专辑故事总数
     * @param condition
     * @return
     */
    Long getAlbumStoryCountById(Map condition);
}
