package me.rainbowland.coffee.service.auth.service;

import me.rainbowland.coffee.service.auth.client.UserClient;
import me.rainbowland.coffee.service.auth.dto.CustomUserDto;
import me.rainbowland.coffee.service.auth.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by lvqiang on 2017/12/26.
 */
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserClient userClient;

	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
		UserDto userDto = Optional.ofNullable(userClient.loadUser(id))
				.orElseThrow(() -> new UsernameNotFoundException(id));
		List<GrantedAuthority> authorities = new ArrayList<>();
		userDto.getAuthorities().forEach(
				authority -> authorities.add(new SimpleGrantedAuthority(authority.getValue()))
		);
		CustomUserDto customUserDto = new CustomUserDto(
				userDto.getId(),
				userDto.getNickname(),
				userDto.getPassword(),
				true,
				true,
				true,
				true,
				authorities);
		return customUserDto;
	}
}
