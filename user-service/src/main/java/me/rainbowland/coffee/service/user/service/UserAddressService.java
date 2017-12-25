package me.rainbowland.coffee.service.user.service;


import me.rainbowland.coffee.service.user.domain.UserAddress;

import java.util.List;

/**
 * Created by lvqiang on 2017/12/5.
 */
public interface UserAddressService {

	List<UserAddress> loadByUserId(String userId);
}
