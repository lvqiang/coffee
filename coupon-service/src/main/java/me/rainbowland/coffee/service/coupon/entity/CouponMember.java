package me.rainbowland.coffee.service.coupon.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by lvqiang on 2017/12/8.
 */
@Entity
@Data
public class CouponMember extends AbstractAuditing {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "user_id", nullable = false)
	private String userId;

	@Size(min = 1, max = 32)
	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "coupon_type", nullable = false)
	private int couponType;

	@Column(name = "consume_type", nullable = false)
	private int consumeType;

	@Column(name = "fee", nullable = false)
	private int fee;

	@Column(name = "min_fee", nullable = false)
	private int minFee;

	@Column(name = "min_cup", nullable = false)
	private int minCup;

	@Column(name = "expire_date", nullable = false)
	private Date expireDate;

	@Column(name = "status", nullable = false)
	private int status;
}
