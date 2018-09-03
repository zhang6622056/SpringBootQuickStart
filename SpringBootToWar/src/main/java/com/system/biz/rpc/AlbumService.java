package com.system.biz.rpc;

import com.system.biz.IAlbumService;
import com.system.biz.rpc.common.JsonResult;
import com.system.biz.rpc.request.album.AlbumCollectRequest;
import com.system.biz.rpc.request.album.AlbumDetailRequest;
import com.system.biz.rpc.response.album.AlbumDetailBasicResponse;
import com.system.biz.rpc.response.album.AlbumDetailResponse;
import com.system.biz.rpc.response.album.AlbumDetailStoryResponse;
import com.system.mapper.album.AlbumMapper;
import com.system.utils.map.QueryChainMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018-08-27.
 */
@Service
public class AlbumService implements IAlbumService{


    @Autowired
    AlbumMapper albumMapper;



    /***
     * 获取专辑详情
     * @param albumDetailRequest
     * @return
     */
    @Override
    public JsonResult getAlbumDetail(AlbumDetailRequest albumDetailRequest) {
        QueryChainMap<String,Object> condition = QueryChainMap.generateQueryChain()
                .chainPut("albumId",albumDetailRequest.getId());
        AlbumDetailBasicResponse albumDetailBasicResponse = albumMapper.getAlbumById(condition);

        condition.chainPut("start",albumDetailRequest.getStart());
        condition.chainPut("size",albumDetailRequest.getSize());
        List<AlbumDetailStoryResponse> list = albumMapper.getAlbumStoryById(condition);
        Long count = albumMapper.getAlbumStoryCountById(condition);

        AlbumDetailResponse albumDetailResponse = new AlbumDetailResponse();
        albumDetailResponse.setAlbumDetailBasicResponse(albumDetailBasicResponse);
        albumDetailResponse.setAlbumDetailStoryResponseList(list);
        albumDetailResponse.setStoryCount(count);
        return new JsonResult(albumDetailResponse);
    }


    /***
     * 获取用户收藏的专辑列表
     * @param albumCollectRequest
     * @return
     */
    @Override
    public JsonResult getCollectAlbumList(AlbumCollectRequest albumCollectRequest) {








        return null;
    }


}
