package me.rainbowland.coffee.service.auth.service;

import me.rainbowland.coffee.service.auth.entity.UserProfile;

/**
 * Created by lvqiang on 2017/12/5.
 */
public interface UserProfileService {

	UserProfile loadUserProfile(Long id);
}
