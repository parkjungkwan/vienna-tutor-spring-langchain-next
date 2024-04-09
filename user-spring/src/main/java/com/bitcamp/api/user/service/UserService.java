package com.bitcamp.api.user.service;

import java.util.List;
import java.util.Optional;

import com.bitcamp.api.common.component.Messenger;
import com.bitcamp.api.common.service.CommandService;
import com.bitcamp.api.common.service.QueryService;
import com.bitcamp.api.user.model.User;
import com.bitcamp.api.user.model.UserDto;


public interface UserService extends CommandService<UserDto>, QueryService<UserDto>{
    Messenger modify(UserDto user);
    List<UserDto> findUsersByName(String name);
    List<UserDto> findUsersByJob(String job);
    Optional<User> findUserByUsername(String username);

    default User dtoToEntity(UserDto dto){
        return User.builder()
                    .id(dto.getId())
                    .username(dto.getUsername())
                    .password(dto.getPassword())
                    .name(dto.getName())
                    .email(dto.getEmail())
                    .phone(dto.getPhone())
                    .job(dto.getJob())
                    .build();
    }

    default UserDto entityToDto(User user){
        return UserDto.builder()
                        .id(user.getId())
                        .username(user.getUsername())
                        .password(user.getPassword())
                        .name(user.getName())
                        .email(user.getEmail())
                        .phone(user.getPhone())
                        .job(user.getJob())
                        .build();
    }
    Messenger login(UserDto param);


    // default UserDto entityToDto(Optional<User> optional){
    //     return UserDto.builder().build();
    // }

}
