package me.rainbowland.coffee.service.order.service;

import me.rainbowland.coffee.service.order.entity.OrderSnap;

import java.util.List;

/**
 * Created by lvqiang on 2017/12/5.
 */
public interface OrderService {

	List<OrderSnap> loadUserOrderList(Long userId);
}
