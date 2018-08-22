package com.system.entity.mark;

/**
 * 标签VO
 * Created by admin on 2018-08-22.
 */
public class MarkVo {
    private Long id;
    private String markTitle;       //'标签文案'
    private String markLevel;       //'标签等级'
    private String markImg;         //'标签LOGO图'

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarkTitle() {
        return markTitle;
    }

    public void setMarkTitle(String markTitle) {
        this.markTitle = markTitle;
    }

    public String getMarkLevel() {
        return markLevel;
    }

    public void setMarkLevel(String markLevel) {
        this.markLevel = markLevel;
    }

    public String getMarkImg() {
        return markImg;
    }

    public void setMarkImg(String markImg) {
        this.markImg = markImg;
    }
}
