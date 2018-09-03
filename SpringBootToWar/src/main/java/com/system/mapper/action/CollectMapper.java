package com.system.mapper.action;

import java.util.Map;

/**
 * 收藏相关
 * Created by admin on 2018-08-22.
 */
public interface CollectMapper {
    /***
     * 收藏一个专辑
     * @param condition
     * @return
     */
    int collectAlbum(Map condition);
    /***
     * 收藏一个故事
     * @param condition
     * @return
     */
    int collectStory(Map condition);
    /***
     * 查看用户，专辑是否有收藏关系
     * @return
     */
    Long colAlbumUser(Map condition);
    /***
     * 查看用户，专辑是否有收藏关系
     * @return
     */
    Long colStoryUser(Map condition);

}
