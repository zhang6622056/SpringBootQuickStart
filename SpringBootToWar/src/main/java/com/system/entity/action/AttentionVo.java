package com.system.entity.action;

import java.util.Date;

/**
 * 关注
 * Created by admin on 2018-08-26.
 */
public class AttentionVo {

    private Long id;
    private Long attFromUser;
    private Long attToUser;
    private Date atTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttFromUser() {
        return attFromUser;
    }

    public void setAttFromUser(Long attFromUser) {
        this.attFromUser = attFromUser;
    }

    public Long getAttToUser() {
        return attToUser;
    }

    public void setAttToUser(Long attToUser) {
        this.attToUser = attToUser;
    }

    public Date getAtTime() {
        return atTime;
    }

    public void setAtTime(Date atTime) {
        this.atTime = atTime;
    }
}
