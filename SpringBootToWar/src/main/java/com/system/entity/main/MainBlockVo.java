package com.system.entity.main;

/**
 * 首页推荐版块
 * Created by Nero on 2018-08-22.
 */
public class MainBlockVo {
    private Long id;
    private String blockImg;        //标题图
    private String blockTitle;         //'标题'
    private Long markIdOne;         //'第一个故事标签ID'
    private Long storyOne;          //'第一个故事ID'
    private Long markIdTwo;         //'第二个故事标签ID'
    private Long storyTwo;          //'第二个故事ID'
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

    public Long getStoryOne() {
        return storyOne;
    }

    public void setStoryOne(Long storyOne) {
        this.storyOne = storyOne;
    }

    public Long getMarkIdTwo() {
        return markIdTwo;
    }

    public void setMarkIdTwo(Long markIdTwo) {
        this.markIdTwo = markIdTwo;
    }

    public Long getStoryTwo() {
        return storyTwo;
    }

    public void setStoryTwo(Long storyTwo) {
        this.storyTwo = storyTwo;
    }

    public Long getSearchMarkId() {
        return searchMarkId;
    }

    public void setSearchMarkId(Long searchMarkId) {
        this.searchMarkId = searchMarkId;
    }
}
