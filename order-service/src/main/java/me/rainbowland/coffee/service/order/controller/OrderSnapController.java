package me.rainbowland.coffee.service.order.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.rainbowland.coffee.service.order.domain.OrderSnap;
import me.rainbowland.coffee.service.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by lvqiang on 2017/12/8.
 */
@RestController
@RequestMapping(value = "/snaps")
@Api(value = "/snaps", description = "用户订单快照相关API")
public class OrderSnapController {

	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	@ApiOperation(value = "用户订单快照列表信息")
	public List<OrderSnap> loadByUserId(@PathVariable("userId") String userId) {
		return orderService.loadByUserId(userId);
	}
}