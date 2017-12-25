package me.rainbowland.coffee.service.user.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by lvqiang on 2017/12/5.
 */
@MappedSuperclass
@EntityListeners(AbstractEntity.class)
@Data
public abstract class AbstractEntity implements Serializable {

	@CreatedDate
	@Column(name = "created_by", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdBy;

	@LastModifiedDate
	@Column(name = "last_modified_by", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedBy;
}
