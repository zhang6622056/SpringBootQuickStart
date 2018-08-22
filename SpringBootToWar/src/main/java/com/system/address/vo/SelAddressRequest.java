package com.system.address.vo;

import java.io.Serializable;

/**
 * 查询用户收货地址
 * Created by Nero on 2017/12/5.
 */
public class SelAddressRequest implements Serializable {
    private Long addressId;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
}
