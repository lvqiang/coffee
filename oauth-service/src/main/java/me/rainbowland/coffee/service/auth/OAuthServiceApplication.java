package me.rainbowland.coffee.service.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created by lvqiang on 2017/11/22.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableAuthorizationServer
public class OAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthServiceApplication.class, args);
	}
}
