package me.rainbowland.coffee.service.auth.service.impl;

import me.rainbowland.coffee.service.auth.entity.UserProfile;
import me.rainbowland.coffee.service.auth.repository.UserProfileRepository;
import me.rainbowland.coffee.service.auth.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lvqiang on 2017/12/5.
 */
@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	UserProfileRepository userProfileRepository;

	@Override
	public UserProfile loadUserProfile(Long id) {
		return userProfileRepository.findOne(id);
	}
}
