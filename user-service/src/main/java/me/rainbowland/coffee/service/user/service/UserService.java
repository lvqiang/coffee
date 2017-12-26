package me.rainbowland.coffee.service.user.service;

import me.rainbowland.coffee.service.user.dto.CreateUserDto;
import me.rainbowland.coffee.service.user.dto.UserDto;


public interface UserService {

    UserDto createUser(CreateUserDto createUserDto);

    UserDto findUser(String id);
}
