package com.system.mapper.user;

import com.system.biz.rpc.response.user.UserBasicResponse;
import com.system.entity.user.UserVo;

import java.util.Map;

/**
 * 用户mapper
 * Created by admin on 2018-08-22.
 */
public interface UserMapper {
    /***
     * 注册用户
     * @param userVo
     * @return
     */
    int insert(UserVo userVo);
    /***
     * 查看相应用户是否注册占用
     * @param condition
     * @return
     */
    int countUserByCondition(Map condition);
    /***
     * 查询用户基本信息
     * @param Condition
     * @return
     */
    UserBasicResponse getUserBasicInfo(Map Condition);
}
