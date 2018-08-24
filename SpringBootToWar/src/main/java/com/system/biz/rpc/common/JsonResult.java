package com.system.biz.rpc.common;

import org.springframework.context.MessageSource;

import java.io.Serializable;
import java.util.Locale;

/**
 * @Author nero
 * Created by admin on 2017/11/1.
 */
public class JsonResult<T> implements Serializable {


    private int retCode;
    private String retMsg;
    private T body;




    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }



    public JsonResult() {
    }

    public JsonResult(int retCode){
        init(retCode,null,null);
    }

    public JsonResult(int retCode, String retMsg){
        init(retCode,retMsg,null);
    }


    public JsonResult(int retCode, String retMsg, T body) {
        init(retCode, retMsg, body);
    }


    public JsonResult(T body) {
        this.retCode = ReturnCode.RUN_SUCCESS_CODE;
        this.retMsg = ReturnCode.RUN_SUCCESS_MSG;
        this.body = body;
    }

    private void init(int retCode, String retMsg, T body){
        this.retCode = retCode;
        this.retMsg = retMsg;
        this.body = body;
    }


}
