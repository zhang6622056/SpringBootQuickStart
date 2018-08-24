package com.system.mapper.main;

import com.system.biz.rpc.response.main.MainMarkResponse;

import java.util.List;
import java.util.Map;

/**
 * 首页标签推荐
 * Created by admin on 2018-08-22.
 */
public interface MainMarkMapper {


    /***
     * 获取banner下方的推荐位
     * @param condition
     * @return
     */
    List<MainMarkResponse> getListMainMark(Map<String,Object> condition);
}
