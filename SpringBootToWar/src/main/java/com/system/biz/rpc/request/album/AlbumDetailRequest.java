package com.system.biz.rpc.request.album;

/**
 * Created by admin on 2018-08-27.
 */
public class AlbumDetailRequest {

    private Long id;
    private Integer start;
    private Integer size;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
