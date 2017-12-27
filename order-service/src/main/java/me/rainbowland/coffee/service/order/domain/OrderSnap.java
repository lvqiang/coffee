package me.rainbowland.coffee.service.order.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lvqiang on 2017/12/8.
 */
@Entity
@Data
@DynamicInsert
@DynamicUpdate
@EqualsAndHashCode(callSuper = false)
public class OrderSnap extends AbstractEntity {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "user_id", nullable = false)
	private String userId;

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

	@OneToMany
	@JoinColumn(name = "order_snap_id")
	private Set<OrderSnapItem>  orderSnapItems = new HashSet<>();
}
