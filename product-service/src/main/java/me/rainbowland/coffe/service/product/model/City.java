package me.rainbowland.coffe.service.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by lvqiang on 2017/11/24.
 */
@Entity
public class City {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String cname;

	@Column(nullable = false)
	private String ename;

	@Column(nullable = false)
	private Integer status;

	@Column(nullable = false, name = "create_date")
	private Date createDate;

	@Column(nullable = false, name = "update_date")
	private Date updateDate;

	public Long getId() {
		return id;
	}

	public City setId(Long id) {
		this.id = id;
		return this;
	}

	public String getCname() {
		return cname;
	}

	public City setCname(String cname) {
		this.cname = cname;
		return this;
	}

	public String getEname() {
		return ename;
	}

	public City setEname(String ename) {
		this.ename = ename;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public City setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public City setCreateDate(Date createDate) {
		this.createDate = createDate;
		return this;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public City setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
		return this;
	}
}
