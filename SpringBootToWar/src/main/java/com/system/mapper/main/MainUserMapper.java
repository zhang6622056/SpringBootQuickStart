package com.system.mapper.main;

import com.system.biz.rpc.response.main.MainUserResponse;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018-08-22.
 */
public interface MainUserMapper {


    /****
     * 获取首页明星用户
     * @param condition
     * @return
     */
    List<MainUserResponse> getMainUserList(Map<String,Object> condition);
}
