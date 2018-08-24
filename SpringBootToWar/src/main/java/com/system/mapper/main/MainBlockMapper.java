package com.system.mapper.main;

import com.system.entity.main.MainBlockVo;

import java.util.List;
import java.util.Map;

/**
 * 首页，推荐2故事mapper
 * Created by admin on 2018-08-22.
 */
public interface MainBlockMapper {
    /***
     * 获取首页块数据
     * @param condition
     * @return
     */
    List<MainBlockVo> getMainBlockList(Map<String,Object> condition);
}
