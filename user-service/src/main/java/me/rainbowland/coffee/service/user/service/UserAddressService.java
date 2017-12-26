package me.rainbowland.coffee.service.user.service;


import me.rainbowland.coffee.service.user.domain.UserAddress;
import me.rainbowland.coffee.service.user.dto.CreateAddressDto;

import java.util.List;

/**
 * Created by lvqiang on 2017/12/5.
 */
public interface UserAddressService {

	List<UserAddress> loadByUserId(String userId);

	UserAddress create(String userId, CreateAddressDto createAddressDto);

	UserAddress update(long id, String userId, CreateAddressDto createAddressDto);

	void delete(long id, String userId);
}
