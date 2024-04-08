package com.bitcamp.api.user.service;

import java.util.List;
import java.util.Optional;

import com.bitcamp.api.common.service.CommandService;
import com.bitcamp.api.common.service.QueryService;
import com.bitcamp.api.user.model.User;
import com.bitcamp.api.user.model.UserDto;


public interface UserService extends CommandService<UserDto>, QueryService<UserDto>{
    String updatePassword(User user);
    List<?> findUsersByName(String name);
    List<?> findUsersByJob(String job);

    default User dtoToEntity(UserDto dto){
        return User.builder()
                    .username(dto.getUsername())
                    .password(dto.getPassword())
                    .name(dto.getName())
                    .phone(dto.getPhone())
                    .job(dto.getJob())
                    .build();
    }

    default UserDto entityToDto(User user){
        return UserDto.builder()
                        .username(user.getUsername())
                        .password(user.getPassword())
                        .name(user.getName())
                        .phone(user.getPhone())
                        .job(user.getJob())
                        .build();
    }


    // default UserDto entityToDto(Optional<User> optional){
    //     return UserDto.builder().build();
    // }

}
