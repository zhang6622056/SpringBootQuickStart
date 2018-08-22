package com.system.address.dao;


import com.application.db.annotation.DbSource;
import com.system.address.vo.SelAddressRequest;
import com.system.address.vo.Address;

import java.util.List;

/**
 * Created by admin on 2017/11/9.
 */
public interface AddressMapper {

    Address findById(SelAddressRequest selAddressRequest);

    Long insert(Address address);

    Long update(Address address);

    List<Address> findByUser(SelAddressRequest selAddressRequest);

    Long updateIsDefault(Long userId);
}
