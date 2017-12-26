package me.rainbowland.coffee.service.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by lvqiang on 2017/12/26.
 */
@Data
@ApiModel(value = "CreateAddressDto", description = "地址创建信息")
public class CreateAddressDto {

	@JsonProperty("name")
	@NotNull(message = "'name' should not be null")
	@Size(min = 1, max = 32)
	@ApiModelProperty(value = "地址名称", position = 1, required = true)
	private String name;

	@JsonProperty("cellphone")
	@NotNull(message = "'cellphone' should not be null")
	@Size(min = 1, max = 32)
	@ApiModelProperty(value = "地址电话", position = 2, required = true)
	private String cellphone;

	@JsonProperty("address")
	@NotNull(message = "'address' should not be null")
	@Size(min = 1, max = 256)
	@ApiModelProperty(value = "地址", position = 3, required = true)
	private String address;

	@JsonProperty("address_detail")
	@NotNull(message = "'address_detail' should not be null")
	@Size(min = 1, max = 1024)
	@ApiModelProperty(value = "详细地址", position = 4, required = true)
	private String addressDetail;

	@JsonProperty("lng")
	@NotNull(message = "'lng' should not be null")
	@ApiModelProperty(value = "详细经度", position = 5, required = true)
	private double lng;

	@JsonProperty("lat")
	@NotNull(message = "'lat' should not be null")
	@ApiModelProperty(value = "详细纬度", position = 6, required = true)
	private double lat;

	@JsonProperty("tag")
	@ApiModelProperty(value = "地址标签", position = 7, required = true)
	private String tag;

}
