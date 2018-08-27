package com.system.web.action;

import com.alibaba.druid.wall.violation.ErrorCode;
import com.system.biz.rpc.IActionService;
import com.system.biz.rpc.common.JsonResult;
import com.system.biz.rpc.common.ReturnCode;
import com.system.biz.rpc.request.action.DoAttentionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户相关操作
 * Created by Nero on 2018-08-26.
 */
@RestController
@RequestMapping("action")
public class UserActionController {

    @Autowired
    IActionService actionService;


    /***
     * 用户关注动作
     * @return
     */
    @RequestMapping(value = "doattention",method= RequestMethod.POST)
    public JsonResult doAttention(DoAttentionRequest doAttentionRequest){
        if(null == doAttentionRequest.getUserId() || null == doAttentionRequest.getToUserId()){
            return new JsonResult(ReturnCode.ERROR_PARAMS_CODE,"参数为空！！");
        }
       return actionService.doAttention(doAttentionRequest);
    }










}
