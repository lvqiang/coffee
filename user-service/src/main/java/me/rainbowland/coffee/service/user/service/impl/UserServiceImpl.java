package me.rainbowland.coffee.service.user.service.impl;

import me.rainbowland.coffee.service.user.domain.Authority;
import me.rainbowland.coffee.service.user.domain.User;
import me.rainbowland.coffee.service.user.dto.CreateUserDto;
import me.rainbowland.coffee.service.user.dto.UserDto;
import me.rainbowland.coffee.service.user.repository.UserRepository;
import me.rainbowland.coffee.service.user.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by lvqiang on 2017/12/25.
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public UserDto createUser(CreateUserDto createUserDto) {
		Optional.ofNullable(userRepository.findOne(createUserDto.getId()))
				.ifPresent(user -> {
					throw new RuntimeException(String.format("user(login_name = %s) already exists.", createUserDto.getId()));
				});
		User user = modelMapper.map(createUserDto, User.class);
		user.setId(createUserDto.getId());
		user.setPassword(new BCryptPasswordEncoder().encode(createUserDto.getId()));
		Authority authority = new Authority();
		authority.setValue("AUTHORITY_USER");
		user.addAuthority(authority);
		userRepository.save(user);

		UserDto userDto = modelMapper.map(user, UserDto.class);
		return userDto;
	}

	@Override
	public UserDto findUser(String id) {
		User user = Optional.ofNullable(userRepository.findOne(id))
				.orElseThrow(() -> new RuntimeException(String.format("user %s not found", id)));
		return modelMapper.map(user, UserDto.class);
	}
}
