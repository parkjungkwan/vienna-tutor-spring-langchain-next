package com.bitcamp.api.user;


import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import com.bitcamp.api.enums.Messenger;

public interface UserService {
    String addUsers();
    String login(User user);
    String updatePassword(User user);
    List<?> findUsersByName(String name);
    Map<String, ?> findUsersByNameFromMap(String name);
    List<?> findUsersByJob(String job);
    Map<String, ?> findUsersByJobFromMap(String job);
    Map<String, ?> getUserMap();

    String test();

    List<?> findUsers() throws SQLException;

    Messenger createUsers() throws SQLException;
}
