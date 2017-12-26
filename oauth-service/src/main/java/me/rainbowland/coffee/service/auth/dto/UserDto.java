package me.rainbowland.coffee.service.auth.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

/**
 * Created by lvqiang on 2017/12/25.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

	@JsonProperty("id")
	private String id;

	@JsonProperty("password")
	private String password;

	@JsonProperty("nickname")
	private String nickname;

	@JsonProperty("authorities")
	private List<AuthorityDto> authorities;
}
