package me.rainbowland.coffe.service.product.domain;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by lvqiang on 2017/11/28.
 */
@Entity
@Data
@DynamicInsert
@DynamicUpdate
public class Product extends AbstractAuditing {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "catalog_id")
	private long catalogId;

	@Size(min = 1, max = 32)
	@Column(nullable = false)
	private String name;

	@Size(min = 1, max = 255)
	@Column(nullable = false)
	private String icon;

	@Column(nullable = false)
	private int status;
}
