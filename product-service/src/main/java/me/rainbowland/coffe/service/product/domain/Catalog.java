package me.rainbowland.coffe.service.product.domain;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lvqiang on 2017/11/28.
 */
@Entity
@Data
@DynamicInsert
@DynamicUpdate
public class Catalog extends AbstractAuditing {

	@Id
	@GeneratedValue
	private long id;

	@Size(min = 1, max = 32)
	@Column(nullable = false)
	private String name;

	@Size(min = 1, max = 255)
	@Column(nullable = false)
	private String icon;

	@Column(nullable = false)
	private int status;

	@OneToMany(mappedBy = "catalogId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Product> products = new HashSet<>();
}
