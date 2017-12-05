package me.rainbowland.coffe.service.product.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by lvqiang on 2017/11/24.
 */
@Entity
@Table(name = "city")
@Data
public class City extends AbstractAuditing {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String cname;

	@Column(nullable = false)
	private String ename;

	@Column(nullable = false)
	private Integer status;
}
