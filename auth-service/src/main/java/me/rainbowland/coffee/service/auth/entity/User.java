package me.rainbowland.coffee.service.auth.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lvqiang on 2017/11/22.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbstractEntity {

	@Id
	@GeneratedValue
	private Long id;

	@Size(min = 1, max = 32)
	@Column(length = 32, unique = true, nullable = false)
	private String username;

	@Size(min = 60, max = 60)
	@Column(length = 60, nullable = false)
	@JsonIgnore
	private String password;

	@Size(min = 1, max = 64)
	@Column(name = "openid",length = 64, unique = true, nullable = false)
	private String openId;

	@Size(max = 256)
	@Column(name = "nickname", length = 256)
	private String nickname;

	@Size(max = 256)
	@Column(name = "image_url", length = 256)
	private String imageUrl;

	@ManyToMany(targetEntity = Role.class, fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Role> roles = new HashSet<>();

	@Transient
	private Set<GrantedAuthority> authorities = new HashSet<>();


	public Set<GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority> userAuthotities = new HashSet<>();
		roles.stream().forEach(role -> {
			role.getAuthorities().stream().forEach(authority -> {
				userAuthotities.add(new SimpleGrantedAuthority(authority.getValue()));
			});
		});
		return userAuthotities;
	}
}
