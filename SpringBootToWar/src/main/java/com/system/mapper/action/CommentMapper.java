package com.system.mapper.action;

import com.system.biz.rpc.response.action.CommentResponse;
import com.system.entity.action.StoryCommentVo;

import java.util.List;
import java.util.Map;

/**
 * 评论相关
 * Created by admin on 2018-08-31.
 */
public interface CommentMapper {
    /***
     * 插入故事评论
     * @param storyCommentVo
     * @return
     */
    int insert(StoryCommentVo storyCommentVo);
    /***
     * 查看故事评论
     * @param condition
     * @return
     */
    List<CommentResponse> listCommentStory(Map condition);
}
