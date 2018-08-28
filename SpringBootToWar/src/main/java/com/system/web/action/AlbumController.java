package com.system.web.action;

import com.system.biz.IAlbumService;
import com.system.biz.rpc.common.JsonResult;
import com.system.biz.rpc.common.ReturnCode;
import com.system.biz.rpc.request.album.AlbumDetailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by Nero on 2018-08-27.
 */
@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    IAlbumService albumService;



    /***
     * 专辑详情页
     * @param albumDetailRequest
     * @return
     */
    @RequestMapping(value="detail",method= RequestMethod.POST)
    public JsonResult getAlbumDetail(AlbumDetailRequest albumDetailRequest){
        if(null == albumDetailRequest || null == albumDetailRequest.getId()){
            return new JsonResult(ReturnCode.ERROR_PARAMS_CODE,ReturnCode.ERROR_PARAMS_MSG);
        }
        if(null == albumDetailRequest.getStart() || null == albumDetailRequest.getSize()){
            return new JsonResult(ReturnCode.ERROR_PARAMS_CODE,ReturnCode.ERROR_PARAMS_MSG);
        }
        return albumService.getAlbumDetail(albumDetailRequest);
    }


}
