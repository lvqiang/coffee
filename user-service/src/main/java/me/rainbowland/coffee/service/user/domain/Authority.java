package me.rainbowland.coffee.service.user.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by lvqiang on 2017/12/5.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Authority extends AbstractEntity {

	@Id
	@GeneratedValue
	private String id;

	@Column
	private String value;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
}
