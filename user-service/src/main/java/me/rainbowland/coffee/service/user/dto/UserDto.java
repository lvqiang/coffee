package me.rainbowland.coffee.service.user.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

/**
 * Created by lvqiang on 2017/12/25.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"id",
		"openId",
		"nickname",
		"imageUrl",
		"couponNum",
		"coffeeNum",
		"beanNum"})
public class UserDto {

	@JsonProperty("id")
	private String id;

	@JsonProperty("openId")
	private String openId;

	@JsonProperty("nickname")
	private String nickname;

	@JsonProperty("imageUrl")
	private String imageUrl;

	@JsonProperty("couponNum")
	private Integer couponNum;

	@JsonProperty("coffeeNum")
	private Integer coffeeNum;

	@JsonProperty("beanNum")
	private Integer beanNum;
}
