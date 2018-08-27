package com.system.biz.rpc;

import com.system.biz.rpc.request.action.DynamicRequest;
import com.system.biz.rpc.response.action.DynamicResponse;
import com.system.entity.action.DynamicVo;

import java.util.List;

/**
 * 动态相关biz
 * Created by admin on 2018-08-26.
 */
public interface IDynamicService {
    DynamicResponse getDynamicList(DynamicRequest dynamicRequest);
}
