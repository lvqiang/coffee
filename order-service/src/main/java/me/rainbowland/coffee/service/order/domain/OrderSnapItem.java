package me.rainbowland.coffee.service.order.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * Created by lvqiang on 2017/12/11.
 */
@Entity
@Data
@DynamicInsert
@DynamicUpdate
@EqualsAndHashCode(callSuper = false)
public class OrderSnapItem extends AbstractEntity {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "order_snap_id")
	private long orderSnapId;

	@Column(name = "name", nullable = false, length = 32)
	private String name;

	@Column(name = "fee")
	private Integer fee;

	@Column(name = "num")
	private Integer num;
}