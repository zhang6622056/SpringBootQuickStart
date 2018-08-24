package com.system.web.main;

import com.system.biz.rpc.IMainService;
import com.system.biz.rpc.common.JsonResult;
import com.system.biz.rpc.response.main.MainDataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nero on 2018-08-22.
 */
@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    IMainService mainService;


    /***
     * 获取首页数据
     * @return
     */
    @RequestMapping("getmain")
    public JsonResult getMain(){
        MainDataResponse mainDataResponse = mainService.getMainData();
        return new JsonResult(mainDataResponse);
    }






}
