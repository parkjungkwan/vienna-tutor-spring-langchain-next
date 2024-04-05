package com.bitcamp.api.user.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.hibernate.mapping.Map;
import org.springframework.stereotype.Service;

import com.bitcamp.api.common.component.MessengerVo;
import com.bitcamp.api.common.component.PageRequestVo;
import com.bitcamp.api.user.UserService;
import com.bitcamp.api.user.model.User;
import com.bitcamp.api.user.model.UserDto;
import com.bitcamp.api.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository ;

   

    @Override
    public UserDto save(UserDto param) {
          
  

        return null;
    }

    @Override
    public String delete(UserDto t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public String save(Object t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public String delete(Object t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public String updatePassword(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePassword'");
    }

    @Override
    public List<?> findUsersByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByName'");
    }

    @Override
    public List<?> findUsersByJob(String job) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByJob'");
    }

    @Override
    public String dummy() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dummy'");
    }

    @Override
    public List<UserDto> findAll(PageRequestVo vo) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<UserDto> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public String count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public Optional<UserDto> getOne(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public Boolean existsById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }
    
}
