package com.bitcamp.api.user;
import com.bitcamp.api.article.model.ArticleDto;
import com.bitcamp.api.common.component.MessengerVo;
import com.bitcamp.api.common.component.PageResultVo;
import com.bitcamp.api.common.proxy.TypeProxy;
import com.bitcamp.api.user.model.User;
import com.bitcamp.api.user.model.UserDto;
import com.bitcamp.api.user.service.UserServiceImpl;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springdoc.core.converters.models.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/users")
@Slf4j
public class UserController {
    private final UserServiceImpl service;

    // -------------------- Command ---------------------------
    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @PostMapping(path = "")
    public ResponseEntity<MessengerVo> save(@RequestBody Map<String, UserDto> param) {
        log.info("입력받은 정보 : {}", param );
        // User newUser = service.save(param);
        return ResponseEntity.ok(new MessengerVo());

     
    }

     // -------------------- Query ---------------------------
     @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
     @PostMapping(path = "/login")
     public ResponseEntity<MessengerVo> login(@RequestBody Map<?, ?> paramap) {
         Map<String, MessengerVo> response = new HashMap<>();
 
         String username = (String)paramap.get("username");
 
         //User user = service.findByUsername(username).orElse(null);
 
         return ResponseEntity.ok(new MessengerVo());
     }

     @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("")
    public ResponseEntity<List<UserDto>> findAll(Pageable pageable){
        return ResponseEntity.ok(new ArrayList<UserDto>());
    }

    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping(path="/{id}")

    public ResponseEntity<Optional<UserDto>> findUserById(@PathVariable Long id) {
        Map<String, String> response = new HashMap<>();
        return ResponseEntity.ok(Optional.of(new UserDto()));
    }



    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @PutMapping("/password")
    public Map<String, ?> updatePassword(@RequestBody Map<?, ?> paramap) {
        Map<String, String> response = new HashMap<>();
        return response;
    }

    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/api/all-users")
    public Map<String, ?> deleteUser(@RequestBody Map<?, ?> paramap) {
        Map<String, String> response = new HashMap<>();

        return response;
    }

     @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/api/all-users")
    public Map<String, ?> getUserList() {
        Map<String, String> response = new HashMap<>();

        return response;
    }

     @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/api/all-users")
    public Map<String, ?> findUserByName(@RequestBody Map<?, ?> paramap) {
        Map<String, String> response = new HashMap<>();
        return response;

    }

     @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/api/all-users")
    public Map<String, ?> findUserByJob(@RequestBody Map<?, ?> paramap) {
        Map<String, String> response = new HashMap<>();
        return response;
    }

    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/api/all-users")
    public Map<String, ?> countUser() {
        Map<String, String> response = new HashMap<>();
        return response;
    }

     @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/api/all-users")
    public Map<String, ?> getOne(@RequestBody Map<?, ?> paramap) throws SQLException {
        Map<String, String> response = new HashMap<>();
        return response;
    }

    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/api/all-users")
    public Map<String, ?> findUsers() throws SQLException {
        Map<String, String> response = new HashMap<>();

        return response;
    }

    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/api/all-users")
    public Map<String, ?> getUser(@RequestBody Map<?, ?> paramap) throws SQLException {
        Map<String, String> response = new HashMap<>();

        return response;
    }

    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/api/all-users")
    public Map<String, ?> touchTable() throws SQLException {
        Map<String, String> response = new HashMap<>();
        return response;
    }

    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/api/all-users")
    public Map<String, ?> removeTable() throws SQLException {
        Map<String, String> response = new HashMap<>();
        return response;
    }

}
