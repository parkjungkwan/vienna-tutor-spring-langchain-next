package com.bitcamp.api.user;
import com.bitcamp.api.article.model.ArticleDto;
import com.bitcamp.api.common.component.Messenger;
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
    public ResponseEntity<Messenger> save(@RequestBody UserDto dto) {
        log.info("입력받은 정보 : {}", dto );
        service.save(dto);
        return ResponseEntity.ok(new Messenger().builder()
                                                .message("SUCCESS")
                                                .code("200")
                                                .build());

    }

     // -------------------- Query ---------------------------

     @PostMapping(path = "/login")
     public ResponseEntity<Messenger> login(@RequestBody Map<?, ?> paramap) {
         Map<String, Messenger> response = new HashMap<>();
 
         String username = (String)paramap.get("username");
 
         //User user = service.findByUsername(username).orElse(null);
 
         return ResponseEntity.ok(new Messenger());
     }


    @GetMapping("/find-all")
    public ResponseEntity<List<UserDto>> findAll(Pageable pageable){

        return ResponseEntity.ok(new ArrayList<UserDto>());
    }

    @GetMapping(path="/find/{id}")

    public ResponseEntity<Optional<UserDto>> findUserById(@PathVariable Long id) {

        return ResponseEntity.ok(Optional.of(new UserDto()));
    }



    @PutMapping("/password")
    public ResponseEntity<Messenger> updatePassword(@RequestBody Map<?, ?> paramap) {

        return ResponseEntity.ok(new Messenger());
    }


    @GetMapping("/delete-user")
    public ResponseEntity<Messenger> deleteUser(@RequestBody Map<?, ?> paramap) {

        return ResponseEntity.ok(new Messenger());
    }


    @GetMapping("/get-user-list")
    public ResponseEntity<Messenger> getUserList() {

        return ResponseEntity.ok(new Messenger());
    }

   
    @GetMapping("/find-user-by-name")
    public ResponseEntity<Messenger> findUserByName(@RequestBody Map<?, ?> paramap) {
        return ResponseEntity.ok(new Messenger());

    }


    @GetMapping("/find-user-by-job")
    public ResponseEntity<Messenger> findUserByJob(@RequestBody Map<?, ?> paramap) {
        return ResponseEntity.ok(new Messenger());
    }


    @GetMapping("/count-users")
    public ResponseEntity<Messenger> countUser() {
        return ResponseEntity.ok(new Messenger());

    }

    @GetMapping("/get-one")
    public ResponseEntity<Messenger> getOne(@RequestBody Map<?, ?> paramap) throws SQLException {
        return ResponseEntity.ok(new Messenger());
    }


    @GetMapping("/find-users")
    public ResponseEntity<Messenger> findUsers() throws SQLException {

        return ResponseEntity.ok(new Messenger());
    }


    @GetMapping("/get-user")
    public ResponseEntity<Messenger> getUser(@RequestBody Map<?, ?> paramap) throws SQLException {

        return ResponseEntity.ok(new Messenger());
    }


    @GetMapping("/touch-table")
    public ResponseEntity<Messenger> touchTable() throws SQLException {
        return ResponseEntity.ok(new Messenger());
    }


    @GetMapping("/remove-table")
    public ResponseEntity<Messenger> removeTable() throws SQLException {
        return ResponseEntity.ok(new Messenger());
    }

}
