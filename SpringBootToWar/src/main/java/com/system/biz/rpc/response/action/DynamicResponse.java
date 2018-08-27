package com.system.biz.rpc.response.action;

import com.system.entity.action.DynamicVo;

import java.util.List;

/**
 * 动态
 * Created by admin on 2018-08-26.
 */
public class DynamicResponse {


    private List<DynamicVo> list;
    private Long  count;

    public List<DynamicVo> getList() {
        return list;
    }

    public void setList(List<DynamicVo> list) {
        this.list = list;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
