package com.bitcamp.api.board;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.bitcamp.api.board.model.BoardDto;
import com.bitcamp.api.board.service.BoardServiceImpl;
import com.bitcamp.api.common.component.Messenger;
import com.bitcamp.api.common.component.PageRequestVo;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public ResponseEntity<Messenger> save(@RequestBody BoardDto dto) throws SQLException {
        return ResponseEntity.ok(service.save(dto));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Messenger> deleteById(@RequestParam long id) throws SQLException {
        return ResponseEntity.ok(service.deleteById(id));
    }
    @GetMapping("/list")
    public ResponseEntity<List<BoardDto>> findAll(PageRequestVo vo) throws SQLException {
        log.info("게시판 목록 : ");
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/detail")
    public ResponseEntity<BoardDto> findById(@RequestParam long id) throws SQLException {
        return ResponseEntity.ok(service.findById(id).orElseGet(BoardDto::new));
    }
    @GetMapping("/count")
    public ResponseEntity<Messenger> count() throws SQLException {
        service.count();
        return ResponseEntity.ok(new Messenger());
    }
    @GetMapping("/exists")
    public ResponseEntity<Boolean> existsById(@RequestParam long id) throws SQLException {
        return ResponseEntity.ok(service.existsById(id));
    }
    
}
