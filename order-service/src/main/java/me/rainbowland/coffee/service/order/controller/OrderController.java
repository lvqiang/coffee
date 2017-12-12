package me.rainbowland.coffee.service.order.controller;

import me.rainbowland.coffee.service.order.entity.OrderSnap;
import me.rainbowland.coffee.service.order.service.OrderService;
import me.rainbowland.coffee.service.order.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by lvqiang on 2017/12/8.
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping(value = "/listByUser")
	public List<OrderSnap> listByUser() {
		long userId = SecurityUtils.getCurrentUserUsername().getId();
		return orderService.loadUserOrderList(userId);
	}
}