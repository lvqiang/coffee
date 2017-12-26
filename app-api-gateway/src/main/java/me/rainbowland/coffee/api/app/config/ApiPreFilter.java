package me.rainbowland.coffee.api.app.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * Created by lvqiang on 2017/12/26.
 */
@Component
public class ApiPreFilter extends ZuulFilter {

	private static final String USER_ID = "user_id";

	@Override
	public String filterType() {
		return PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		return 8;
	}

	@Override
	public boolean shouldFilter() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication instanceof OAuth2Authentication) {
			RequestContext ctx = RequestContext.getCurrentContext();
			ctx.set(USER_ID, authentication.getPrincipal());
			return true;
		}
		return false;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		ctx.addZuulRequestHeader("x_user_id", (String) ctx.get(USER_ID));
		return null;
	}

}
