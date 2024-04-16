package com.bitcamp.api.user;
import com.bitcamp.api.common.component.Messenger;
import com.bitcamp.api.common.component.PageRequestVo;
import com.bitcamp.api.user.model.UserDto;
import com.bitcamp.api.user.service.UserService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
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
public class UserController {
    private final UserService service;


    @SuppressWarnings("static-access")
    @PostMapping( "/save")
    public ResponseEntity<Messenger> save(@RequestBody UserDto dto) {
        return ResponseEntity.ok(service.save(dto));

    }


    @GetMapping("/list")
    public ResponseEntity<List<UserDto>> findAll(PageRequestVo vo){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/detail")

    public ResponseEntity<Optional<UserDto>> findById(@RequestParam Long id) {
        return ResponseEntity.ok(service.findById(id));
    }



    @PutMapping("/modify")
    public ResponseEntity<Messenger> modify(@RequestBody UserDto param) {
        return ResponseEntity.ok(service.modify(param));
    }


    @DeleteMapping("/delete")
    public ResponseEntity<Messenger> deleteById(@RequestParam Long id) {
        return ResponseEntity.ok(service.deleteById(id));
    }

    @GetMapping("/count")
    public ResponseEntity<Messenger> count() {
        return ResponseEntity.ok(service.count());

    }

    @PostMapping("/search")
    public ResponseEntity<List<UserDto>> findUsersByName(@RequestBody UserDto param) {
        return ResponseEntity.ok(service.findUsersByName(param.getName()));
    }

    @PostMapping("/login")
    public ResponseEntity<Messenger> login(@RequestBody UserDto param) {
        return ResponseEntity.ok(service.login(param));
    }
    @GetMapping("/exists")
    public ResponseEntity<Boolean> existsById(@RequestParam long id) {
        return ResponseEntity.ok(service.existsById(id));
    }

}
