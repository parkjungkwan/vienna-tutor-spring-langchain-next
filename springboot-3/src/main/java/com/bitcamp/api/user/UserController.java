package com.bitcamp.api.user;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitcamp.api.enums.Messenger;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository repo;

    @PostMapping("/api/login")
    public Map<String, ?> login(@RequestBody Map<?,?> paramMap){
        Map<String, Messenger> map = new HashMap<>();
        String username = (String) paramMap.get("username");
        String password = (String) paramMap.get("password");
        User dbUser = repo.findByUsername(username).orElse(null);
        System.out.println("DB User is "+dbUser);
        if(dbUser == null){
            map.put("message", Messenger.FAIL);
        }else if(!dbUser.getPassword().equals(password)){
            map.put("message", Messenger.WRONG_PASSWORD);
        }else{
            map.put("message", Messenger.SUCCESS);
        }
        return map;
    }


    @PostMapping(path="/api/users")
    public Map<String, ?> join(@RequestBody Map<?,?> paramMap) {
        String strHeight = String.valueOf(paramMap.get("height"));
        String strWeight = String.valueOf(paramMap.get("weight"));

        @SuppressWarnings("null")
        User newUser =  repo.save(User.builder()
         .username((String) paramMap.get("username"))
         .password((String) paramMap.get("password"))
         .name((String) paramMap.get("name"))
         .phone((String) paramMap.get("phone"))
         .job((String) paramMap.get("job"))
         .height(Double.parseDouble(strHeight))
         .weight(Double.parseDouble(strWeight))
         .build());
         System.out.println("DB 에 저장된 User 정보: "+newUser);
        Map<String, Messenger> map = new HashMap<>();
        map.put("result",Messenger.SUCCESS);
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
