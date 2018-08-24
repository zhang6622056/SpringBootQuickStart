package com.system.sms;

import com.system.utils.HttpUtil;
import com.system.utils.map.QueryChainMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 发送短信
 * Created by Nero on 2018-08-24.
 */
@Service
public class SmsService {

    @Value("${sms.send.url}")
    private String url;
    @Value("${sms.send.username}")
    private String username;
    @Value("${sms.send.pwd}")
    private String pwd;



    public String sendSms(String mobile,String content){
        QueryChainMap<String,String> initParam = initParam();
        initParam.chainPut("mobile",mobile).chainPut("content",content);
        return HttpUtil.doPost(url,initParam);
    }


    private QueryChainMap<String,String> initParam(){
       return QueryChainMap.generateQueryChain()
                    .chainPut("username",username)
                    .chainPut("pwd",pwd);
    }
}
