package com.bitcamp.api.user.service;
import com.bitcamp.api.common.service.CommandService;
import com.bitcamp.api.common.service.QueryService;
import com.bitcamp.api.user.model.UserDto;
import com.mysql.cj.Query;

public interface UserService extends CommandService<UserDto>, QueryService<UserDto>{
    void dummy(UserDto param);
}
