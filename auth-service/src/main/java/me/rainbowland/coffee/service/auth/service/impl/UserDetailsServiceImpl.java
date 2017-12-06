package me.rainbowland.coffee.service.auth.service.impl;

import me.rainbowland.coffee.service.auth.entity.AuthUserDetail;
import me.rainbowland.coffee.service.auth.entity.User;
import me.rainbowland.coffee.service.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;


/**
 * Created by lvqiang on 2017/11/22.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	public UserDetails loadUserByUsername(String openId) throws UsernameNotFoundException {
		Optional<User> realUser = userRepository.findOneWithRolesByOpenId(openId);

		return realUser.map(user -> {
			Set<GrantedAuthority> grantedAuthorities = user.getAuthorities();
			return new AuthUserDetail(user.getId(), user.getUsername(), user.getPassword(), user.getOpenId(), grantedAuthorities);
		}).orElseThrow(() -> new UsernameNotFoundException("用户" + openId + "不存在!"));
	}
}
