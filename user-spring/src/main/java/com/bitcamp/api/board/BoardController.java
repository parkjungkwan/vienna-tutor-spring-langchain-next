package com.bitcamp.api.board;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.bitcamp.api.board.model.BoardDto;
import com.bitcamp.api.board.service.BoardServiceImpl;
import com.bitcamp.api.common.component.Messenger;
import com.bitcamp.api.common.component.PageRequestVo;

import java.sql.SQLException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardServiceImpl service;


    @PostMapping("")
    public ResponseEntity<Messenger> save(BoardDto dto) throws SQLException {
        service.save(null);
        return ResponseEntity.ok(new Messenger());
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
