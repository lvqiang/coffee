package me.rainbowland.coffee.service.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import me.rainbowland.coffee.service.user.dto.CreateUserDto;
import me.rainbowland.coffee.service.user.dto.UserDto;
import me.rainbowland.coffee.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/users")
@Api(value = "/users", description = "用户相关API")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ApiOperation(value = "创建用户")
	public UserDto createUser(
			@ApiParam(name = "user", value = "要创建的用户信息", required = true) @Valid @RequestBody CreateUserDto createUserDto) {
		return userService.createUser(createUserDto);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "获取用户信息")
	public UserDto loadUserByOpenId(@ApiParam(name = "open_id", value = "用户open_id", required = true) @RequestParam("open_id") String openId) {
		return userService.findUserByOpenId(openId);
	}

}
