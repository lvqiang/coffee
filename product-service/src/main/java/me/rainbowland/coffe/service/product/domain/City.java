package me.rainbowland.coffe.service.product.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * Created by lvqiang on 2017/11/24.
 */
@Entity
@Data
@DynamicInsert
@DynamicUpdate
@EqualsAndHashCode(callSuper = false)
public class City extends AbstractAuditing {

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String cname;

	@Column(nullable = false)
	private String ename;

	@Column(nullable = false)
	private int status;
}
