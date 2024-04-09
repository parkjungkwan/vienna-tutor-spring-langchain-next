package com.bitcamp.api.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import java.sql.SQLException;
import java.util.*;
import lombok.RequiredArgsConstructor;

import org.springdoc.core.converters.models.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bitcamp.api.common.component.Messenger;
import com.bitcamp.api.common.component.PageRequestVo;
import com.bitcamp.api.user.model.User;
import com.bitcamp.api.user.model.UserDto;
import com.bitcamp.api.user.repository.UserRepository;

@Log4j2
@RequiredArgsConstructor
@Service 
public class UserServiceImpl implements UserService {
    
    private final UserRepository repository;

    @Override
    public Messenger save(UserDto t) {
       entityToDto((repository.save(dtoToEntity(t))));
       return new Messenger();
    }

    @Override
    public Messenger deleteById(Long id) {
        repository.deleteById(id);
        return new Messenger();
    }

    @Override
    public List<UserDto> findAll() { 
        return repository.findAll().stream().map(i->entityToDto(i)).toList();
    }

    @Override
    public Optional<UserDto> findById(Long id) {
        // Optional.of(entityToDto(repository.findById(id)));
        return null;
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public Messenger modify(UserDto user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePassword'");
    }

    @Override
    public List<UserDto> findUsersByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByName'");
    }

    @Override
    public List<UserDto> findUsersByJob(String job) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByJob'");
    }


    @Override
    public Optional<User> findUserByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public Messenger login(UserDto param) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

   
    
}
