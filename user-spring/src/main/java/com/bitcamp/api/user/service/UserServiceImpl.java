package com.bitcamp.api.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import java.sql.SQLException;
import java.util.*;
import java.util.stream.Stream;

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
    public Messenger save(UserDto dto) {
        User ent = repository.save(dtoToEntity(dto));
        System.out.println(" ============ UserServiceImpl save instanceof =========== ");
        System.out.println((ent instanceof User) ? "SUCCESS" : "FAILURE");
        return Messenger.builder()
        .message((ent instanceof User) ? "SUCCESS" : "FAILURE")
        .build();
    }

    @Override
    public Messenger deleteById(Long id) {
        repository.deleteById(id);
        return Messenger.builder()
        .message(repository.findById(id).isPresent() ? "SUCCESS" : "FAILURE")
        .build();
    }

    @Override
    public List<UserDto> findAll() { 
        return repository.findAll().stream().map(i->entityToDto(i)).toList();
    }

    @Override
    public Optional<UserDto> findById(Long id) {
        return repository.findById(id).map(i -> entityToDto(i));
    }

    @Override
    public Messenger count() {
        return Messenger.builder()
        .message(repository.count()+"")
        .build();
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public Messenger modify(UserDto dto) {
        User ent = repository.save(dtoToEntity(dto));
        log.info(" ============ BoardServiceImpl modify Entity Debug =========== ");
        log.info(ent);
        System.out.println((ent instanceof User) ? "SUCCESS" : "FAILURE");
        return Messenger.builder()
        .message((ent instanceof User) ? "SUCCESS" : "FAILURE")
        .build();
    }

    @Override
    public List<UserDto> findUsersByName(String name) {
        return repository.findUsersByName(name).stream().map(i->entityToDto(i)).toList();
    }

    @Override
    public List<UserDto> findUsersByJob(String job) {
        return repository.findUsersByJob(job).stream().map(i->entityToDto(i)).toList();
    }


    @Override
    public Optional<User> findUserByUsername(String username) {
        return repository.findByUsername(username);
    }

    // SRP 에 따라 아이디 존재여부를 프론트에서 먼저 판단하고, 넘어옴 (시큐리티)
    @Override
    public Messenger login(UserDto dto) {
        return Messenger.builder()
        .message(findUserByUsername(dto.getUsername()).get().getPassword().equals(dto.getPassword()) ? "SUCCESS" : "FAILURE")
        .build();
    }

   
    
}
