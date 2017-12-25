package me.rainbowland.coffee.service.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by lvqiang on 2017/12/22.
 */
@Data
@ApiModel(value = "CreateUserDto", description = "用户创建信息")
public class CreateUserDto implements Serializable {

	@JsonProperty("open_id")
	@NotNull(message = "'open_id' should not be null")
	@ApiModelProperty(value = "微信openId", position = 1, required = true)
	private String openId;

	@JsonProperty("nickname")
	@NotNull(message = "'nickname' should not be null")
	@ApiModelProperty(value = "昵称", position = 2, required = true)
	private String nickname;

	@JsonProperty("image_url")
	@ApiModelProperty(value = "头像地址", position = 3, required = true)
	private String imageUrl;
}