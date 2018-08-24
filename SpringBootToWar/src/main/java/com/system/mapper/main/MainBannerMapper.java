package com.system.mapper.main;

import com.system.entity.main.MainBannerVo;

import java.util.List;
import java.util.Map;

/**
 *  首页-banner
 * Created by Nero on 2018-08-22.
 */
public interface MainBannerMapper {


    /***
     * 获取首页banner list
     * @param condition
     * @return
     */
    List<MainBannerVo> getListMainBanner(Map<String,Object> condition);
}
