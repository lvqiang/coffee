package me.rainbowland.coffee.service.auth.controller;

import me.rainbowland.coffee.service.auth.entity.UserProfile;
import me.rainbowland.coffee.service.auth.service.UserProfileService;
import me.rainbowland.coffee.service.auth.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by lvqiang on 2017/11/23.
 */
@RestController
public class UserController {

	@Autowired
	private UserProfileService userProfileService;

	@GetMapping("/user")
	public Principal user(Principal user) {
		return user;
	}

	@GetMapping("/profile")
	public UserProfile profile() {
		long userId = SecurityUtils.getCurrentUserUsername().getId();
		return userProfileService.loadUserProfile(userId);
	}
}
