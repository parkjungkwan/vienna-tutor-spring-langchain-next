package com.bitcamp.api.board;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.bitcamp.api.board.model.BoardDto;
import com.bitcamp.api.board.service.BoardServiceImpl;
import com.bitcamp.api.common.component.Messenger;
import com.bitcamp.api.common.component.PageRequestVo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/api/boards")
public class BoardController {

    private final BoardServiceImpl service;


    @PostMapping("/save")
    public ResponseEntity<Messenger> save(BoardDto dto) throws SQLException {
        log.info("입력받은 정보 : {}", dto );
        return ResponseEntity.ok(service.save(dto));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Messenger> deleteById(@PathVariable long id) throws SQLException {
        log.info("입력받은 정보 : {}" , id);
        return ResponseEntity.ok(service.deleteById(id));
    }
    @GetMapping("/list")
    public ResponseEntity<List<BoardDto>> findAll(PageRequestVo vo) throws SQLException {
        log.info("입력받은 정보 : {}" );
        return ResponseEntity.ok(service.findAll());
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
