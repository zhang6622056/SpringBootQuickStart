package com.system.web.action;

import com.system.biz.rpc.IDynamicService;
import com.system.biz.rpc.common.JsonResult;
import com.system.biz.rpc.common.ReturnCode;
import com.system.biz.rpc.request.action.DynamicRequest;
import com.system.biz.rpc.response.action.DynamicResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018-08-26.
 */
@RestController
@RequestMapping("/dynamic")
public class DynamicController {



    public static final String VAL_USER_NULL = "用户ID不可为空";
    public static final String VAL_PAGE_NULL = "分页参数不可为空";


    @Autowired
    IDynamicService dynamicService;




    /***
     * 获取用户动态
     * @param dynamicRequest
     * @return
     */
    @RequestMapping(value = "/getuserdynamic",method= RequestMethod.POST)
    public JsonResult getUserDynamic(DynamicRequest dynamicRequest){

        if(null == dynamicRequest.getUserId()){
            return new JsonResult(ReturnCode.ERROR_PARAMS_CODE,VAL_USER_NULL);
        }
        if(null == dynamicRequest.getStart() || null == dynamicRequest.getSize()){
            return new JsonResult(ReturnCode.ERROR_PARAMS_CODE,VAL_USER_NULL);
        }
        DynamicResponse dynamicResponse = dynamicService.getDynamicList(dynamicRequest);
        return new JsonResult(dynamicResponse);
    }






}
