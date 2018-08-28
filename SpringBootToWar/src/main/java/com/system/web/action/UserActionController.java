package com.system.web.action;

import com.alibaba.druid.wall.violation.ErrorCode;
import com.system.biz.rpc.IActionService;
import com.system.biz.rpc.common.JsonResult;
import com.system.biz.rpc.common.ReturnCode;
import com.system.biz.rpc.request.action.CollectRequest;
import com.system.biz.rpc.request.action.DoAttentionRequest;
import com.system.biz.rpc.request.action.HistoryRequest;
import com.system.biz.rpc.request.action.PubCommentRequest;
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


    /***
     * 记录播放历史
     * @return
     */
    @RequestMapping(value = "recordhistory",method= RequestMethod.POST)
    public JsonResult recordHistory(HistoryRequest historyRequest){
        if(null == historyRequest.getUserId() || null == historyRequest.getHrefId()
                    || null == historyRequest.getPlayType()){
            return new JsonResult(ReturnCode.ERROR_PARAMS_CODE,ReturnCode.ERROR_PARAMS_MSG);
        }
        actionService.recordHistory(historyRequest);
        return new JsonResult(null);
    }


    /***
     * 发布评论
     * @return
     */
    @RequestMapping(value = "pubcomment",method= RequestMethod.POST)
    public JsonResult pubComment(PubCommentRequest pubCommentRequest){
        if(null == pubCommentRequest ||
                    null == pubCommentRequest.getUserId() ||
                    null == pubCommentRequest.getCommentText() ||
                    null ==  pubCommentRequest.getCommentType() ||
                    null == pubCommentRequest.getStoryId()){
            return new JsonResult(ReturnCode.ERROR_PARAMS_CODE,ReturnCode.ERROR_PARAMS_MSG);
        }
        actionService.pubComment(pubCommentRequest);
        return new JsonResult(null);
    }


    /***
     * 收藏操作
     * @return
     */
    @RequestMapping(value = "docollect",method= RequestMethod.POST)
    public JsonResult doCollect(CollectRequest collectRequest){
        if(null == collectRequest ||
                    null == collectRequest.getUserId() ||
                    null == collectRequest.getColType() ||
                    null == collectRequest.getColId()){
            return new JsonResult(ReturnCode.ERROR_PARAMS_CODE,ReturnCode.ERROR_PARAMS_MSG);
        }
        actionService.doCollect(collectRequest);
        return new JsonResult(null);
    }















}
