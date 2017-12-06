package me.rainbowland.coffee.service.auth.service;

import me.rainbowland.coffee.service.auth.entity.UserAddress;

import java.util.List;

/**
 * Created by lvqiang on 2017/12/5.
 */
public interface UserAddressService {

	List<UserAddress> loadUserAddress(Long userId);
}
