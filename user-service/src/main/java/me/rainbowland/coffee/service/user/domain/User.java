package me.rainbowland.coffee.service.user.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.util.CollectionUtils;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvqiang on 2017/11/22.
 */
@Entity
@Data
@DynamicInsert
@DynamicUpdate
@EqualsAndHashCode(callSuper = false)
public class User extends AbstractEntity {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String id;

	@Size(min = 1, max = 64)
	@Column(name = "open_id", length = 64, unique = true, nullable = false)
	private String openId;

	@Size(min = 60, max = 60)
	@Column(length = 60, nullable = false)
	private String password;

	@Size(max = 256)
	@Column(name = "nickname", length = 256)
	private String nickname;

	@Size(max = 256)
	@Column(name = "image_url", length = 256)
	private String imageUrl;

	@Column(name = "coupon_num")
	private int couponNum;

	@Column(name = "coffee_num")
	private int coffeeNum;

	@Column(name = "bean_num")
	private int beanNum;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Authority> authorities;

	public Authority addAuthority(Authority authority) {
		if (CollectionUtils.isEmpty(authorities)) {
			authorities = new ArrayList<>();
		}
		authorities.add(authority);
		authority.setUser(this);
		return authority;
	}

	public Authority removeAuthority(Authority authority) {
		authorities.remove(authority);
		authority.setUser(null);
		return authority;
	}

}
