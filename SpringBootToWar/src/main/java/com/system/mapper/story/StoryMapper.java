package com.system.mapper.story;

import com.system.entity.story.StoryVo;

/**
 *
 * Created by Nero on 2018-08-22.
 */
public interface StoryMapper {
    /**
     * 发布故事
     * @param storyVo
     * @return
     */
    int insert(StoryVo storyVo);
}
