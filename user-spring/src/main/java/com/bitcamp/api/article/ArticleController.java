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
import com.bitcamp.api.article.service.ArticleServiceImpl;
import com.bitcamp.api.common.component.MessengerVo;
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
    public ResponseEntity<MessengerVo> save(PageRequestVo vo) throws SQLException {
        service.save(null);
        return ResponseEntity.ok(new MessengerVo());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<MessengerVo> deleteById(@PathVariable long id) throws SQLException {
        service.deleteById(0L);
        return ResponseEntity.ok(new MessengerVo());
    }
    @GetMapping("")
    public ResponseEntity<MessengerVo> findAll(PageRequestVo vo) throws SQLException {
        service.findAll(null);
        return ResponseEntity.ok(new MessengerVo());
    }
    @GetMapping("/{id}")
    public ResponseEntity<MessengerVo> findById(PageRequestVo vo) throws SQLException {
        service.findById(0L);
        return ResponseEntity.ok(new MessengerVo());
    }
    @GetMapping("/count")
    public ResponseEntity<MessengerVo> count(PageRequestVo vo) throws SQLException {
        service.count();
        return ResponseEntity.ok(new MessengerVo());
    }
    @GetMapping("/exists/{id}")
    public ResponseEntity<MessengerVo> existsById(@PathVariable long id) throws SQLException {
        service.existsById(0L);
        return ResponseEntity.ok(new MessengerVo());
    }
}
