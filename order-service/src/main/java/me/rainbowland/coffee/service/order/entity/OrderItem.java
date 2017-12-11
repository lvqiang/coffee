package me.rainbowland.coffee.service.order.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by lvqiang on 2017/12/11.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderItem {

	@Id
	@GeneratedValue
	private Long id;

	@JoinColumn(name = "order_id")
	@ManyToOne(optional = false)
	private Order order;

	@Column(name = "name", nullable = false, length = 32)
	private String name;

	@Column(name = "fee")
	private Integer fee;

	@Column(name = "num")
	private Integer num;
}