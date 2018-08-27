package com.system.biz.rpc;

import com.system.biz.rpc.common.JsonResult;
import com.system.biz.rpc.request.action.DoAttentionRequest;

/**
 * 用户动作
 * Created by Nero on 2018-08-26.
 */
public interface IActionService {

    /***
     * 用户关注
     * @param doAttentionRequest
     * @return
     */
    JsonResult doAttention(DoAttentionRequest doAttentionRequest);




}
