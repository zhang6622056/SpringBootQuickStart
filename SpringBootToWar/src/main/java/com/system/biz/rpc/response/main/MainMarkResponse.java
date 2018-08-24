package com.system.biz.rpc.response.main;

import java.io.Serializable;

/**
 * 标签response
 * Created by Nero on 2018-08-24.
 */
public class MainMarkResponse implements Serializable{
    private Long id;
    private Long markId;        //标签ID
    private String markTitle;   //标签TITLE
    private String markImg;     //标签图

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMarkId() {
        return markId;
    }

    public void setMarkId(Long markId) {
        this.markId = markId;
    }

    public String getMarkTitle() {
        return markTitle;
    }

    public void setMarkTitle(String markTitle) {
        this.markTitle = markTitle;
    }

    public String getMarkImg() {
        return markImg;
    }

    public void setMarkImg(String markImg) {
        this.markImg = markImg;
    }
}
