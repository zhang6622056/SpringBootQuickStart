package com.system.mapper.main;

import com.system.biz.rpc.response.main.MainRecommendResponse;
import com.system.entity.main.MainBannerVo;

import java.util.List;
import java.util.Map;

/**
 *  首页-banner
 * Created by Nero on 2018-08-22.
 */
public interface MainRecommendMapper {


    /***
     * 获取首页推荐位
     * @param condition
     * @return
     */
    List<MainRecommendResponse> getListMainRec(Map<String, Object> condition);
}
