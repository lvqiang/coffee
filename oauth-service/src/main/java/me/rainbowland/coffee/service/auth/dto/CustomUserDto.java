package me.rainbowland.coffee.service.auth.dto;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * Created by lvqiang on 2017/12/26.
 */
@Data
public class CustomUserDto extends User {

	private String nickname;

	public CustomUserDto(String id,
					  String nickname,
					  String password,
					  boolean enabled,
					  boolean accountNonExpired,
					  boolean credentialsNonExpired,
					  boolean accountNonLocked,
					  Collection<? extends GrantedAuthority> authorities) {
		super(id,
				password,
				enabled,
				accountNonExpired,
				credentialsNonExpired,
				accountNonLocked,
				authorities);
		this.nickname = nickname;
	}

}
