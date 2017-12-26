package me.rainbowland.coffee.service.auth.client;

import feign.hystrix.FallbackFactory;
import me.rainbowland.coffee.service.auth.dto.UserDto;
import org.springframework.stereotype.Component;

/**
 * Created by lvqiang on 2017/12/25.
 */
@Component
public class UserClientFallbackFactory implements FallbackFactory<UserClient> {

	@Override
	public UserClient create(Throwable cause) {
		return new UserClient() {
			@Override
			public UserDto loadUser(String id) {
				return null;
			}
		};
	}
}
