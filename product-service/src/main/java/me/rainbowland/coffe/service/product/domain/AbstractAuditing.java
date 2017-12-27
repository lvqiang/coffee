package me.rainbowland.coffe.service.product.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by lvqiang on 2017/11/28.
 */
@MappedSuperclass
@Data
@EntityListeners(AbstractAuditing.class)
public abstract class AbstractAuditing implements Serializable {

	private static final long serialVersionUID = 1L;

	@CreatedDate
	@Column(name = "created_by", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@JsonIgnore
	private Date createdBy;

	@LastModifiedDate
	@Column(name = "last_modified_by", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@JsonIgnore
	private Date lastModifiedBy;
}
