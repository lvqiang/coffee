package me.rainbowland.coffee.service.user.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * Created by lvqiang on 2017/12/5.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class UserAddress extends AbstractEntity{

	@Id
	@GeneratedValue
	private String id;

	@Column(name = "user_id", nullable = false)
	private String userId;

	@Size(max = 32)
	@Column(name = "name", length = 32)
	private String name;

	@Size(max = 32)
	@Column(name = "cellphone", length = 32)
	private String cellphone;

	@Size(max = 256)
	@Column(name = "address", length = 256)
	private String address;

	@Size(max = 1024)
	@Column(name = "address_detail", length = 1024)
	private String addressDetail;

	@Column(name = "lng")
	private double lng;

	@Column(name = "lat")
	private double lat;

	@Size(max = 2)
	@Column(name = "tag", length = 2)
	private String tag;

}
