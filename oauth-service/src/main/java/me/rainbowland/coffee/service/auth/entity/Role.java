package me.rainbowland.coffee.service.auth.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lvqiang on 2017/12/5.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Role extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String name;

	@Column
	private String value;

	@ManyToMany(targetEntity = Authority.class,fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Authority> authorities = new HashSet<>();

}
