package me.rainbowland.coffee.service.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import me.rainbowland.coffee.service.user.domain.UserAddress;
import me.rainbowland.coffee.service.user.dto.CreateAddressDto;
import me.rainbowland.coffee.service.user.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by lvqiang on 2017/12/26.
 */
@RestController
@RequestMapping(value = "/users/address")
@Api(value = "/users/address", description = "用户地址相关API")
public class AddressController {

	@Autowired
	private UserAddressService userAddressService;

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	@ApiOperation(value = "获取用户地址列表信息")
	public List<UserAddress> loadList(@PathVariable("userId") String userId) {
		return userAddressService.loadByUserId(userId);
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.POST)
	@ApiOperation(value = "创建用户地址列表信息")
	public UserAddress create(@PathVariable("userId") String userId,
							  @ApiParam(name = "address", value = "要创建的地址信息", required = true) @Valid @RequestBody CreateAddressDto createAddressDto) {
		return userAddressService.create(userId, createAddressDto);
	}

	@RequestMapping(value = "/{userId}/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "更新用户地址列表信息")
	public UserAddress update(@PathVariable("userId") String userId,
							  @PathVariable("id") long id,
							  @ApiParam(name = "address", value = "要更新的地址信息", required = true) @Valid @RequestBody CreateAddressDto createAddressDto) {
		return userAddressService.update(id, userId, createAddressDto);
	}

	@RequestMapping(value = "/{userId}/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除用户地址列表信息")
	public void update(@PathVariable("userId") String userId,
					   @PathVariable("id") long id) {
		userAddressService.delete(id, userId);
	}
}