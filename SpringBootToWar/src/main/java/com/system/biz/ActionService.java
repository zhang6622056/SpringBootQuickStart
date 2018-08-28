package com.system.biz;

import com.system.biz.rpc.IActionService;
import com.system.biz.rpc.common.Constant;
import com.system.biz.rpc.common.JsonResult;
import com.system.biz.rpc.common.ReturnCode;
import com.system.biz.rpc.request.action.CollectRequest;
import com.system.biz.rpc.request.action.DoAttentionRequest;
import com.system.biz.rpc.request.action.HistoryRequest;
import com.system.biz.rpc.request.action.PubCommentRequest;
import com.system.entity.action.AttentionVo;
import com.system.entity.action.StoryCommentVo;
import com.system.mapper.action.ActionMapper;
import com.system.mapper.action.AttentionMapper;
import com.system.mapper.action.DynamicMapper;
import com.system.mapper.action.HistoryMapper;
import com.system.utils.map.QueryChainMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.Date;
import java.util.Map;

/**
 * Created by admin on 2018-08-26.
 */
@Service
public class ActionService implements IActionService{

    @Autowired
    AttentionMapper attentionMapper;
    @Autowired
    HistoryMapper historyMapper;
    @Autowired
    ActionMapper actionMapper;


    /***
     * 关注用户
     * @param doAttentionRequest
     * @return
     */
    @Override
    public JsonResult doAttention(DoAttentionRequest doAttentionRequest) {
        //-验证是否已关注
        QueryChainMap condition = QueryChainMap.generateQueryChain()
                            .chainPut("userId",doAttentionRequest.getUserId())
                                .chainPut("toUserId",doAttentionRequest.getToUserId());
        long count = attentionMapper.selValidate(condition);
        if(count > 0){
            return new JsonResult(ReturnCode.ERROR_VALIDATE_CODE, ReturnCode.ERROR_VALIDATE_MSG);
        }

        //-插入关注关系
        AttentionVo attentionVo = new AttentionVo();
        attentionVo.setAttFromUser(doAttentionRequest.getUserId());
        attentionVo.setAttToUser(doAttentionRequest.getToUserId());
        attentionVo.setAtTime(new Date());
        attentionMapper.insert(attentionVo);
        return new JsonResult(null);
    }


    /***
     * 记录播放历史
     * @param historyRequest
     * @return
     */
    @Override
    public Boolean recordHistory(HistoryRequest historyRequest) {
        Map<String,Object> condition = QueryChainMap.generateQueryChain()
                .chainPut("userId",historyRequest.getUserId())
                .chainPut("hrefId",historyRequest.getHrefId())
                .chainPut("hrefType",historyRequest.getPlayType())
                .chainPut("playTime",new Date());
        if(historyRequest.getPlayType().equals(Constant.HISTORY_RECORD_TYPE_STORY)){
            historyMapper.insertStoryHistory(condition);
        }
        return true;
    }


    /***
     * 发布评论
     * @param pubCommentRequest
     * @return
     */
    @Override
    public Boolean pubComment(PubCommentRequest pubCommentRequest) {
        StoryCommentVo storyCommentVo = new StoryCommentVo();
        if(pubCommentRequest.getCommentType().equals(Constant.TEXT_COMMENT_TYPE)){
            storyCommentVo.setCommentText(pubCommentRequest.getCommentText());
        }else if(pubCommentRequest.getCommentType().equals(Constant.AUDIO_COMMENT_TYPE)){
            storyCommentVo.setCommentHref(pubCommentRequest.getCommentText());
        }
        storyCommentVo.setCommentTime(new Date());
        storyCommentVo.setCommentType(pubCommentRequest.getCommentType());
        storyCommentVo.setStoryId(pubCommentRequest.getStoryId());
        storyCommentVo.setUserId(pubCommentRequest.getUserId());
        storyCommentVo.setxState(Constant.DATA_DISPLAY_CODE_ENALBE);
        actionMapper.commentInsert(storyCommentVo);
        return true;
    }


    /***
     * 用户收藏，专辑，故事
     * @param collectRequest
     * @return
     */
    @Override
    public Boolean doCollect(CollectRequest collectRequest) {
        QueryChainMap condition = QueryChainMap.generateQueryChain()
                                        .chainPut("userId",collectRequest.getUserId())
                                        .chainPut("hrefId",collectRequest.getColId())
                                        .chainPut("colTime",new Date())
                                        .chainPut("xState",Constant.DATA_DISPLAY_CODE_ENALBE);
        if(collectRequest.getColType().equals(Constant.COLLECT_TYPE_STORY)){
            actionMapper.collectStoryInsert(condition);
        }else{
            actionMapper.collectAlbumInsert(condition);
        }
        return true;
    }


}
