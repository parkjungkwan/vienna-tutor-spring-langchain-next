package com.bitcamp.api.user;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class UserController {

    @PostMapping("/login")
    public Map<String, ?> login(@RequestBody Map<?,?> paramMap){
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

    public Map<String, ?> addUsers() {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

    public Map<String, ?> save(@RequestBody Map<?,?> paramMap) {
 
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

    public Map<String, ?> findAll() {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }



    public Map<String, ?> findById(@RequestBody Map<?,?> paramMap) {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

    public Map<String, ?> updatePassword(@RequestBody Map<?,?> paramMap) {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

    public Map<String, ?> delete(@RequestBody Map<?,?> paramMap) {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

    public Map<String, ?> existsById(@RequestBody Map<?,?> paramMap) {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

    public Map<String, ?> findUsersByName(@RequestBody Map<?,?> paramMap) {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

    public Map<String, ?> findUsersByNameFromMap(@RequestBody Map<?,?> paramMap) {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

    public Map<String, ?> findUsersByJob(@RequestBody Map<?,?> paramMap) {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

    public Map<String, ?> findUsersByJobFromMap(@RequestBody Map<?,?> paramMap) {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

    public Map<String, ?> count() {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }
    public Map<String, ?> getOne(@RequestBody Map<?,?> paramMap) {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }
    public Map<String, ?> getUserMap(){
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }



    public Map<String, ?> findUsers() throws SQLException {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

    public Map<String, ?> createUsers() throws SQLException {
        Map<String, ?> map = new HashMap<>();
       
        return map;
    }

}
