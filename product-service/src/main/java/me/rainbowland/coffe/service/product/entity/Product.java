package me.rainbowland.coffe.service.product.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by lvqiang on 2017/11/28.
 */
@Entity
@Table(name = "product")
@Data
public class Product extends AbstractAuditing {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "catalog_id")
	private Catalog catalog;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String icon;

	@Column(nullable = false)
	private Integer status;
}
