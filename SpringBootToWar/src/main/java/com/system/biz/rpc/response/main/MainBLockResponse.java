package com.system.biz.rpc.response.main;

import java.io.Serializable;

/**
 * Created by admin on 2018-08-24.
 */
public class MainBLockResponse implements Serializable{

    private Long id;
    private String blockImg;        //标题图
    private String blockTitle;         //'标题'
    private Long markIdOne;         //'第一个故事标签ID'
    private String markTextOne;     //第一个故事标签文案
    private Long storyOne;          //'第一个故事ID'
    private String storyTextOne;    //第一个故事名称
    private Long markIdTwo;         //'第二个故事标签ID'
    private String markTextTwo;     //第二个故事标签名字
    private Long storyTwo;          //'第二个故事ID'
    private String storyTextTwo;        //第二个故事名字
    private Long searchMarkId;      //大ID，左上角大标签ID

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlockImg() {
        return blockImg;
    }

    public void setBlockImg(String blockImg) {
        this.blockImg = blockImg;
    }

    public String getBlockTitle() {
        return blockTitle;
    }

    public void setBlockTitle(String blockTitle) {
        this.blockTitle = blockTitle;
    }

    public Long getMarkIdOne() {
        return markIdOne;
    }

    public void setMarkIdOne(Long markIdOne) {
        this.markIdOne = markIdOne;
    }

    public String getMarkTextOne() {
        return markTextOne;
    }

    public void setMarkTextOne(String markTextOne) {
        this.markTextOne = markTextOne;
    }

    public Long getStoryOne() {
        return storyOne;
    }

    public void setStoryOne(Long storyOne) {
        this.storyOne = storyOne;
    }

    public String getStoryTextOne() {
        return storyTextOne;
    }

    public void setStoryTextOne(String storyTextOne) {
        this.storyTextOne = storyTextOne;
    }

    public Long getMarkIdTwo() {
        return markIdTwo;
    }

    public void setMarkIdTwo(Long markIdTwo) {
        this.markIdTwo = markIdTwo;
    }

    public String getMarkTextTwo() {
        return markTextTwo;
    }

    public void setMarkTextTwo(String markTextTwo) {
        this.markTextTwo = markTextTwo;
    }

    public Long getStoryTwo() {
        return storyTwo;
    }

    public void setStoryTwo(Long storyTwo) {
        this.storyTwo = storyTwo;
    }

    public String getStoryTextTwo() {
        return storyTextTwo;
    }

    public void setStoryTextTwo(String storyTextTwo) {
        this.storyTextTwo = storyTextTwo;
    }

    public Long getSearchMarkId() {
        return searchMarkId;
    }

    public void setSearchMarkId(Long searchMarkId) {
        this.searchMarkId = searchMarkId;
    }
}
