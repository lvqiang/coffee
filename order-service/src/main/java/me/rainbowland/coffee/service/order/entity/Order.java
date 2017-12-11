package me.rainbowland.coffee.service.order.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lvqiang on 2017/12/8.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Order extends AbstractAuditing {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "user_id", nullable = false)
	private Long userId;

	@Column(name = "origin_fee", nullable = false)
	private Integer originFee;

	@Column(name = "total_fee", nullable = false)
	private Integer totalFee;

	@Column(name = "deliver_fee", nullable = false)
	private Integer deliverFee;

	@Column(name = "coupon_fee", nullable = false)
	private Integer couponFee;

	@Column(name = "deliver_name", nullable = false, length = 32)
	private String deliverName;

	@Column(name = "deliver_cellphone", nullable = false, length = 32)
	private String deliverCellphone;

	@Column(name = "deliver_address", nullable = false, length = 1024)
	private String deliverAddress;

	@Column(name = "deliver_time", nullable = false, length = 50)
	private String deliverTime;

	@Column(name = "status", nullable = false)
	private Integer status;

	@OneToMany(mappedBy = "order", orphanRemoval = true)
	private Set<OrderItem>  orderItems = new HashSet<>();

}
