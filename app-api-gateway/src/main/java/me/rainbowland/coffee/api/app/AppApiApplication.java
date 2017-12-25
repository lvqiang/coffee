package me.rainbowland.coffee.api.app;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by lvqiang on 2017/11/24.
 */
@EnableZuulProxy
@SpringCloudApplication
public class AppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApiApplication.class, args);
	}
}
