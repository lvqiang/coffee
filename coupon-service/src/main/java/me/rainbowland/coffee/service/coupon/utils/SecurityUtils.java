package me.rainbowland.coffee.service.coupon.utils;

import me.rainbowland.coffee.service.coupon.entity.AuthUserDetail;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by lvqiang on 2017/12/6.
 */
public class SecurityUtils {

	public static AuthUserDetail getCurrentUserUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		AuthUserDetail currentUserName = null;
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			currentUserName = (AuthUserDetail) authentication.getPrincipal();
		}
		return currentUserName;
	}
}
