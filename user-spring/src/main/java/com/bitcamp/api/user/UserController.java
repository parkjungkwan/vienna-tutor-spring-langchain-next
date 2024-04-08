package com.bitcamp.api.user;
import com.bitcamp.api.article.model.ArticleDto;
import com.bitcamp.api.common.component.Messenger;
import com.bitcamp.api.common.component.PageResultVo;
import com.bitcamp.api.common.proxy.TypeProxy;
import com.bitcamp.api.user.model.User;
import com.bitcamp.api.user.model.UserDto;
import com.bitcamp.api.user.service.UserService;
import com.bitcamp.api.user.service.UserServiceImpl;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    private final UserService service;


    @SuppressWarnings("static-access")
    @PostMapping( "/save")
    public ResponseEntity<Messenger> save(@RequestBody UserDto dto) {
        log.info("입력받은 정보 : {}", dto );
        return ResponseEntity.ok(service.save(dto));

    }


    @GetMapping("/list")
    public ResponseEntity<List<UserDto>> findAll(){
        log.info("입력받은 정보 : {}" );
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/detail")

    public ResponseEntity<Optional<UserDto>> findById(@RequestParam Long id) {
        log.info("입력받은 정보 : {}", id );
        return ResponseEntity.ok(service.findById(id));
    }



    @PutMapping("/modify")
    public ResponseEntity<Messenger> modify(@RequestBody UserDto param) {
        log.info("입력받은 정보 : {}", param );
        return ResponseEntity.ok(service.modify(param));
    }


    @DeleteMapping("/delete")
    public ResponseEntity<Messenger> deleteById(@RequestParam Long id) {
        log.info("입력받은 정보 : {}", id );
        return ResponseEntity.ok(service.deleteById(id));
    }

    @GetMapping("/count")
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(service.count());

    }

    @PostMapping("/search")
    public ResponseEntity<List<UserDto>> findUsersByName(@RequestBody UserDto param) {
        //log.info("입력받은 정보 : {}", name );
        return ResponseEntity.ok(service.findUsersByName(param.getName()));
    }

    @PostMapping(path = "/login")
    public ResponseEntity<Messenger> login(@RequestBody UserDto param) {
       log.info("입력받은 정보 : {}", param );
        return ResponseEntity.ok(service.login(param));
    }


}
