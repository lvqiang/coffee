package me.rainbowland.coffee.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * Created by lvqiang on 2017/12/5.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class UserProfile extends AbstractEntity{

	@Id
	private Long id;

	@Size(max = 256)
	@Column(name = "nickname", length = 256)
	private String nickname;

	@Size(max = 256)
	@Column(name = "image_url", length = 256)
	private String imageUrl;

	@Column(name = "coupon_num")
	private Integer couponNum;

	@Column(name = "coffee_num")
	private Integer coffeeNum;

	@Column(name = "bean_num")
	private Integer beanNum;

}
