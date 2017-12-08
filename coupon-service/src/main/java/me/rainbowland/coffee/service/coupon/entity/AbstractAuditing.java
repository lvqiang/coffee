package me.rainbowland.coffee.service.coupon.entity;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;

/**
 * Created by lvqiang on 2017/11/28.
 */
@MappedSuperclass
@Data
@EntityListeners(AbstractAuditing.class)
public abstract class AbstractAuditing implements Serializable {

	private static final long serialVersionUID = 1L;

	@CreatedBy
	@Column(name = "created_by", nullable = false, length = 50, updatable = false)
	@JsonIgnore
	private String createdBy;

	@CreatedDate
	@Column(name = "created_date", nullable = false)
	@JsonIgnore
	private Long createdDate = Instant.now().getEpochSecond();

	@LastModifiedBy
	@Column(name = "last_modified_by", length = 50)
	@JsonIgnore
	private String lastModifiedBy;

	@LastModifiedDate
	@Column(name = "last_modified_date")
	@JsonIgnore
	private Long lastModifiedDate = Instant.now().getEpochSecond();



}
