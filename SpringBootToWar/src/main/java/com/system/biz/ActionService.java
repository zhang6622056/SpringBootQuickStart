package com.system.biz;

import com.system.biz.rpc.IActionService;
import com.system.biz.rpc.common.JsonResult;
import com.system.biz.rpc.common.ReturnCode;
import com.system.biz.rpc.request.action.DoAttentionRequest;
import com.system.entity.action.AttentionVo;
import com.system.mapper.action.AttentionMapper;
import com.system.mapper.action.DynamicMapper;
import com.system.utils.map.QueryChainMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by admin on 2018-08-26.
 */
@Service
public class ActionService implements IActionService{

    @Autowired
    AttentionMapper attentionMapper;


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





}
