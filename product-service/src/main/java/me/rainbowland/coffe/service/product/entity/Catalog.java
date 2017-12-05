package me.rainbowland.coffe.service.product.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lvqiang on 2017/11/28.
 */
@Entity
@Table(name = "catalog")
@Data
public class Catalog extends AbstractAuditing {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String icon;

	@Column(nullable = false)
	private Integer status;

	@OneToMany(mappedBy = "catalog", orphanRemoval = true)
	private Set<Product> products = new HashSet<>();
}
