package me.rainbowland.coffee.service.user.service.impl;

import me.rainbowland.coffee.service.user.domain.UserAddress;
import me.rainbowland.coffee.service.user.dto.CreateAddressDto;
import me.rainbowland.coffee.service.user.repository.UserAddressRepository;
import me.rainbowland.coffee.service.user.service.UserAddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by lvqiang on 2017/12/5.
 */
@Service
public class UserAddressServiceImpl implements UserAddressService {

	@Autowired
	UserAddressRepository userAddressRepository;

	@Override
	public List<UserAddress> loadByUserId(String userId) {
		return userAddressRepository.findByUserId(userId);
	}

	@Override
	public UserAddress create(String userId, CreateAddressDto createAddressDto) {
		UserAddress userAddress = new UserAddress();
		BeanUtils.copyProperties(createAddressDto, userAddress);
		userAddress.setUserId(userId);
		userAddressRepository.save(userAddress);
		return userAddress;
	}

	@Override
	public UserAddress update(long id, String userId, CreateAddressDto createAddressDto) {
		UserAddress userAddress = Optional.ofNullable(userAddressRepository.findOne(id))
				.orElseThrow(() -> new RuntimeException(String.format("address(%s) not exist", id)));
		BeanUtils.copyProperties(createAddressDto, userAddress);
		userAddressRepository.saveAndFlush(userAddress);
		return userAddress;
	}

	@Override
	public void delete(long id, String userId) {
		UserAddress userAddress = Optional.ofNullable(userAddressRepository.findOne(id))
				.orElseThrow(() -> new RuntimeException(String.format("address(%s) not exist", id)));
		if (!userAddress.getUserId().equals(userId)) {
			throw new RuntimeException(String.format("address(%s) not belong to (%s)", id, userId));
		}
		userAddressRepository.delete(id);
	}

}
