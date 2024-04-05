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

@ApiResponses(value = {
    @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
    @ApiResponse(responseCode = "404", description = "Customer not found")})
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/users")
@Slf4j
public class UserController {
    private final UserServiceImpl service;

    // -------------------- Command ---------------------------

    @PostMapping(path = "")
    public ResponseEntity<MessengerVo> save(@RequestBody Map<String, UserDto> param) {
        log.info("입력받은 정보 : {}", param );
        // User newUser = service.save(param);
        return ResponseEntity.ok(new MessengerVo());

    }

     // -------------------- Query ---------------------------

     @PostMapping(path = "/login")
     public ResponseEntity<MessengerVo> login(@RequestBody Map<?, ?> paramap) {
         Map<String, MessengerVo> response = new HashMap<>();
 
         String username = (String)paramap.get("username");
 
         //User user = service.findByUsername(username).orElse(null);
 
         return ResponseEntity.ok(new MessengerVo());
     }


    @GetMapping("")
    public ResponseEntity<List<UserDto>> findAll(Pageable pageable){

        return ResponseEntity.ok(new ArrayList<UserDto>());
    }

    @GetMapping(path="/{id}")

    public ResponseEntity<Optional<UserDto>> findUserById(@PathVariable Long id) {

        return ResponseEntity.ok(Optional.of(new UserDto()));
    }



    @PutMapping("/password")
    public ResponseEntity<MessengerVo> updatePassword(@RequestBody Map<?, ?> paramap) {

        return ResponseEntity.ok(new MessengerVo());
    }


    @GetMapping("/api/all-users")
    public ResponseEntity<MessengerVo> deleteUser(@RequestBody Map<?, ?> paramap) {

        return ResponseEntity.ok(new MessengerVo());
    }


    @GetMapping("/api/all-users")
    public ResponseEntity<MessengerVo> getUserList() {

        return ResponseEntity.ok(new MessengerVo());
    }

   
    @GetMapping("/api/all-users")
    public ResponseEntity<MessengerVo> findUserByName(@RequestBody Map<?, ?> paramap) {
        return ResponseEntity.ok(new MessengerVo());

    }


    @GetMapping("/api/all-users")
    public ResponseEntity<MessengerVo> findUserByJob(@RequestBody Map<?, ?> paramap) {
        return ResponseEntity.ok(new MessengerVo());
    }


    @GetMapping("/api/all-users")
    public ResponseEntity<MessengerVo> countUser() {
        return ResponseEntity.ok(new MessengerVo());

    }

    @GetMapping("/api/all-users")
    public ResponseEntity<MessengerVo> getOne(@RequestBody Map<?, ?> paramap) throws SQLException {
        return ResponseEntity.ok(new MessengerVo());
    }


    @GetMapping("/api/all-users")
    public ResponseEntity<MessengerVo> findUsers() throws SQLException {

        return ResponseEntity.ok(new MessengerVo());
    }


    @GetMapping("/api/all-users")
    public ResponseEntity<MessengerVo> getUser(@RequestBody Map<?, ?> paramap) throws SQLException {

        return ResponseEntity.ok(new MessengerVo());
    }


    @GetMapping("/api/all-users")
    public ResponseEntity<MessengerVo> touchTable() throws SQLException {
        return ResponseEntity.ok(new MessengerVo());
    }


    @GetMapping("/api/all-users")
    public ResponseEntity<MessengerVo> removeTable() throws SQLException {
        return ResponseEntity.ok(new MessengerVo());
    }

}
