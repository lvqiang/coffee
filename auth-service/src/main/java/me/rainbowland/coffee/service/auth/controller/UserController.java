package me.rainbowland.coffee.service.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by lvqiang on 2017/11/23.
 */
@RestController
public class UserController {

	@GetMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
}
