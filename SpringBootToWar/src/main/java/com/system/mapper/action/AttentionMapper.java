package com.system.mapper.action;

import com.system.biz.rpc.request.action.DoAttentionRequest;
import com.system.entity.action.AttentionVo;

import java.util.Map;

/**
 * 关注相关
 * Created by admin on 2018-08-22.
 */
public interface AttentionMapper {

    /***
     * 插入关注关系
     * @return
     */
    int insert(AttentionVo attentionVo);

    /***
     * 查询验证
     * @return
     */
    long selValidate(Map condition);










}
