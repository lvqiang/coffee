package me.rainbowland.coffee.service.auth.controller;

import me.rainbowland.coffee.service.auth.entity.UserAddress;
import me.rainbowland.coffee.service.auth.service.UserAddressService;
import me.rainbowland.coffee.service.auth.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/23.
 */
@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private UserAddressService userAddressService;

	@GetMapping("/list")
	public List<UserAddress> list() {
		long userId = SecurityUtils.getCurrentUserUsername().getId();
		return userAddressService.loadUserAddress(userId);
	}
}
