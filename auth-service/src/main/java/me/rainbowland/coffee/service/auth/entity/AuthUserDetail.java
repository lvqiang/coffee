package me.rainbowland.coffee.service.auth.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Created by lvqiang on 2017/12/6.
 */
@Data
public class AuthUserDetail extends org.springframework.security.core.userdetails.User {

	private Long id;
	private String openId;

	public AuthUserDetail(Long id, String username, String password, String openId, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, true, true, true, true, authorities);
		this.id = id;
		this.openId = openId;
	}
}
