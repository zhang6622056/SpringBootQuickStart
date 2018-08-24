package com.system.utils;

import com.system.utils.map.QueryChainMap;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * http请求工具类
 * Created by Nero on 2018-08-24.
 */
public class HttpUtil {

    private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);

    /***
     * 发送POST请求
     * @param url
     * @param params
     * @return
     */
    public static String doPost(String url,Map<String,String> params){
        String result = "";
        try{
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpPost method = new HttpPost(url);

            //转换参数
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            for(String key : params.keySet()){
                list.add(new BasicNameValuePair(key,params.get(key)));
            }
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,
                    "UTF-8");
            //entity.setContentType("application/json");
            method.setEntity(entity);

            //-发送请求
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(2000).build();//设置请求和传输超时时间
            method.setConfig(requestConfig);
            HttpResponse response = httpClient.execute(method);
            if (response != null) {
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    result = EntityUtils.toString(resEntity, "UTF-8");
                }
            }
            return result;
        }catch(Exception e){
            logger.error(e.getMessage(),e);
        }
        return result;
    }


    public static void main(String[] args) {
        String url = "http://47.95.33.177:9002/df_httpserver/smsSend.do";

        Map<String,String> query = QueryChainMap.generateQueryChain()
                    .chainPut("username","100001")
                    .chainPut("pwd","E10LFDGLKF20F883E0F8830F883")
                    .chainPut("mobile","18801222471")
                    .chainPut("content","jkldfjkalsdfghhkjuhjkasdf");
        System.out.println(doPost(url,query));
    }







}
