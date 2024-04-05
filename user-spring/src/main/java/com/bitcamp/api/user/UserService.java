package com.bitcamp.api.user;

import java.util.List;

import com.bitcamp.api.common.service.CommandService;
import com.bitcamp.api.common.service.QueryService;
import com.bitcamp.api.user.model.User;
import com.bitcamp.api.user.model.UserDto;


public interface UserService extends CommandService<UserDto>, QueryService<UserDto>{
    String updatePassword(User user);
    List<?> findUsersByName(String name);
    List<?> findUsersByJob(String job);

}
