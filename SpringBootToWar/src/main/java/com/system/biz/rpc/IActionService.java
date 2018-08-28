package com.system.biz.rpc;

import com.system.biz.rpc.common.JsonResult;
import com.system.biz.rpc.request.action.CollectRequest;
import com.system.biz.rpc.request.action.DoAttentionRequest;
import com.system.biz.rpc.request.action.HistoryRequest;
import com.system.biz.rpc.request.action.PubCommentRequest;

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
    /***
     * 记录播放历史
     * @return
     */
    Boolean recordHistory(HistoryRequest historyRequest);
    /***
     * 发布评论
     * @param pubCommentRequest
     * @return
     */
    Boolean pubComment(PubCommentRequest pubCommentRequest);
    /***
     * 收藏专辑，故事
     * @return
     */
    Boolean doCollect(CollectRequest collectRequest);




}
