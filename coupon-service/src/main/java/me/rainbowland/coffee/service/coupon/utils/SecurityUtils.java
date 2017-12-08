package me.rainbowland.coffee.service.coupon.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.rainbowland.coffee.service.coupon.entity.AuthUserDetail;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import java.util.Map;

/**
 * Created by lvqiang on 2017/12/6.
 */
public class SecurityUtils {

	public static AuthUserDetail getCurrentUserUsername() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		OAuth2Authentication authentication = (OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication();
		try {
			Map<String, Object> tmp = (Map<String, Object>) ((Map<String, Object>) authentication.getUserAuthentication().getDetails()).get("userAuthentication");
			String tmp2 = objectMapper.writeValueAsString(tmp.get("principal"));
			System.out.println(objectMapper.writeValueAsString(tmp));
			System.out.println(objectMapper.writeValueAsString(tmp2));
			AuthUserDetail currentUserName = objectMapper.readValue(tmp2, AuthUserDetail.class);
			System.out.println(objectMapper.writeValueAsString(currentUserName));
			return currentUserName;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
