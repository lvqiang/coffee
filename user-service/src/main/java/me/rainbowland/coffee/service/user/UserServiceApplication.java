package me.rainbowland.coffee.service.user;

import me.rainbowland.coffee.service.user.domain.User;
import me.rainbowland.coffee.service.user.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by lvqiang on 2017/12/25.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		modelMapper.createTypeMap(User.class, UserDto.class).setConverter(context -> {
			User source = context.getSource();
			UserDto destination = new UserDto();

			destination.setId(source.getId());
			destination.setOpenId(source.getOpenId());
			destination.setNickname(source.getNickname());
			destination.setBeanNum(source.getBeanNum());
			destination.setCoffeeNum(source.getCoffeeNum());
			destination.setCouponNum(source.getCouponNum());
			return destination;
		});

		return modelMapper;
	}
}
