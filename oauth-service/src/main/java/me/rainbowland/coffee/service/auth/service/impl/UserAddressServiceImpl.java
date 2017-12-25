package me.rainbowland.coffee.service.auth.service.impl;

import me.rainbowland.coffee.service.auth.entity.UserAddress;
import me.rainbowland.coffee.service.auth.repository.UserAddressRepository;
import me.rainbowland.coffee.service.auth.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lvqiang on 2017/12/5.
 */
@Service
public class UserAddressServiceImpl implements UserAddressService {

	@Autowired
	UserAddressRepository userAddressRepository;


	@Override
	public List<UserAddress> loadUserAddress(Long userId) {
		return userAddressRepository.findByUserId(userId);
	}
}
