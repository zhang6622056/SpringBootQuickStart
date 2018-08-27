package com.system.biz;

import com.system.biz.rpc.IDynamicService;
import com.system.biz.rpc.request.action.DynamicRequest;
import com.system.biz.rpc.response.action.DynamicResponse;
import com.system.entity.action.DynamicVo;
import com.system.mapper.action.DynamicMapper;
import com.system.utils.map.QueryChainMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018-08-26.
 */
@Service
public class DynamicService implements IDynamicService{

    @Autowired
    DynamicMapper dynamicMapper;


    /***
     * 获取动态list
     * @param dynamicRequest
     * @return
     */
    @Override
    public DynamicResponse getDynamicList(DynamicRequest dynamicRequest) {
       QueryChainMap<String,Object> condition = QueryChainMap.generateQueryChain()
                .chainPut("userId",dynamicRequest.getUserId())
                .chainPut("start",dynamicRequest.getStart())
                .chainPut("size",dynamicRequest.getSize());
        List<DynamicVo>  listdata = dynamicMapper.getDynamicList(condition);
        Long total = dynamicMapper.getDynamicListCount(condition);

        DynamicResponse dynamicResponse = new DynamicResponse();
        dynamicResponse.setList(listdata);
        dynamicResponse.setCount(total);
        return dynamicResponse;
    }
}
