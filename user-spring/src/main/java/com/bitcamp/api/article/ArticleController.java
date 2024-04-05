package com.bitcamp.api.article;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bitcamp.api.common.component.PageResultVo;
import com.bitcamp.api.article.model.ArticleDto;
import com.bitcamp.api.article.service.ArticleServiceImpl;
import com.bitcamp.api.common.component.MessengerVo;
import com.bitcamp.api.common.component.PageRequestVo;
import com.bitcamp.api.common.component.PageResultVo;

import lombok.RequiredArgsConstructor;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/articles")
public class ArticleController {

    private final ArticleServiceImpl service;

    @GetMapping("")
    public ResponseEntity<PageResultVo<ArticleDto, Object[]>> findAll(PageRequestVo vo) throws SQLException {
        Map<String, Object> map = new HashMap<>();



        return ResponseEntity.ok(service.findAll(vo));
    }
}
