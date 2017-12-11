package me.rainbowland.coffee.service.order.repository;

import me.rainbowland.coffee.service.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by lvqiang on 2017/12/5.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	List<Order> findByUserId(Long userId);
}
