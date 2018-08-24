package com.system.mapper.main;

import com.system.biz.rpc.response.main.MainLoveRankResponse;

import java.util.List;
import java.util.Map;

/**
 * 公益排行榜
 * Created by admin on 2018-08-24.
 */
public interface MainRankMapper {
    /***
     * 获取排名list
     * @param condition
     * @return
     */
    List<MainLoveRankResponse> getRankList(Map<String,Object> condition);
}
