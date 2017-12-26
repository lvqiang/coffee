package me.rainbowland.coffee.service.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by lvqiang on 2017/12/25.
 */
@Data
public class AuthorityDto {

	@JsonProperty("value")
	private String value;
}
