package me.rainbowland.coffee.service.order.service.impl;

import me.rainbowland.coffee.service.order.entity.OrderSnap;
import me.rainbowland.coffee.service.order.repository.OrderRepository;
import me.rainbowland.coffee.service.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lvqiang on 2017/12/8.
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<OrderSnap> loadUserOrderList(Long userId) {
		return orderRepository.findByUserId(userId);
	}
}
