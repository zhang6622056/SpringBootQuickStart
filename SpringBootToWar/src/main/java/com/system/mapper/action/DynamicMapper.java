package com.system.mapper.action;

import com.system.entity.action.DynamicVo;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018-08-25.
 */
public interface DynamicMapper {

    /***
     * 插入动态
     * @param dynamicVo
     * @return
     */
    int insert(DynamicVo dynamicVo);

    /***
     * 获取动态list
     * @param condition
     * @return
     */
    List<DynamicVo> getDynamicList(Map<String,Object> condition);

    /***
     * 获取动态list分页count
     * @param condition
     * @return
     */
    Long getDynamicListCount(Map<String,Object> condition);

}
