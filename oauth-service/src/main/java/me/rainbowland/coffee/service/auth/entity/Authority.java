package me.rainbowland.coffee.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lvqiang on 2017/12/5.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Authority extends AbstractEntity {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String name;

	@Column
	private String value;
}
