package me.rainbowland.coffee.service.auth.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;


/**
 * Created by lvqiang on 2017/11/22.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Set<GrantedAuthority> grantedAuthorities = new LinkedHashSet<>();
		grantedAuthorities.add(new GrantedAuthority() {
			@Override
			public String getAuthority() {
				return "role";
			}
		});
		return new User("rainbow", "$2a$10$XOVs4Z1YtPKqKwQVywG9j.xLAqXYRQLGZMGMrZDNbtl6pUC0Weteq", grantedAuthorities);
	}
}
