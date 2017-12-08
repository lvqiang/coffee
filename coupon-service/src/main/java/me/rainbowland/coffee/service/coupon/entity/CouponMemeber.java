package me.rainbowland.coffee.service.coupon.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * Created by lvqiang on 2017/12/8.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class CouponMemeber extends AbstractAuditing {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "user_id", nullable = false)
	private Integer userId;

	@Size(max = 32)
	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "coupon_type", nullable = false)
	private Integer couponType;

	@Column(name = "consume_type", nullable = false)
	private Integer consumeType;

	@Column(name = "fee", nullable = false)
	private Integer fee;

	@Column(name = "min_fee", nullable = false)
	private Integer minFee;

	@Column(name = "min_cup", nullable = false)
	private Integer minCup;

	@Size(max = 50)
	@Column(name = "expire_date", nullable = false)
	private String expireDate;

	@Column(name = "status", nullable = false)
	private Integer status;
}
