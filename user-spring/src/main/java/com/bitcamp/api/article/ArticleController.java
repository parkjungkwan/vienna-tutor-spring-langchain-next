package com.bitcamp.api.article;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitcamp.api.article.model.ArticleDto;
import com.bitcamp.api.article.service.ArticleServiceImpl;
import com.bitcamp.api.common.component.Messenger;
import com.bitcamp.api.common.component.PageRequestVo;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@ApiResponses(value = {
    @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
    @ApiResponse(responseCode = "404", description = "Customer not found")})
@RequestMapping("/api/articles")
public class ArticleController {

    private final ArticleServiceImpl service;


    @PostMapping("")
    public ResponseEntity<Messenger> save(ArticleDto dto) throws SQLException {
        ArticleDto newDto = service.save(dto);
        Messenger messenger = (newDto.getId()!= 0L) 
        ? Messenger.builder().build()
        : Messenger.builder().build();


        return ResponseEntity.ok(messenger);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Messenger> deleteById(@PathVariable long id) throws SQLException {
        service.deleteById(0L);
        return ResponseEntity.ok(new Messenger());
    }
    @GetMapping("")
    public ResponseEntity<Messenger> findAll(PageRequestVo vo) throws SQLException {
        service.findAll(null);
        return ResponseEntity.ok(new Messenger());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Messenger> findById(PageRequestVo vo) throws SQLException {
        service.findById(0L);
        return ResponseEntity.ok(new Messenger());
    }
    @GetMapping("/count")
    public ResponseEntity<Messenger> count(PageRequestVo vo) throws SQLException {
        service.count();
        return ResponseEntity.ok(new Messenger());
    }
    @GetMapping("/exists/{id}")
    public ResponseEntity<Messenger> existsById(@PathVariable long id) throws SQLException {
        service.existsById(0L);
        return ResponseEntity.ok(new Messenger());
    }
}
