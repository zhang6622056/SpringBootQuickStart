package com.system.mapper.action;

import com.system.entity.action.StoryCommentVo;

import java.util.Map;

/**
 * Created by admin on 2018-08-27.
 */
public interface ActionMapper {
    /***
     * 保存评论
     * @param storyCommentVo
     * @return
     */
    int commentInsert(StoryCommentVo storyCommentVo);
    /***
     * 保存专辑收藏
     * @return
     */
    int collectAlbumInsert(Map condition);
    /***
     * 保存故事收藏
     * @param condition
     * @return
     */
    int collectStoryInsert(Map condition);
}
