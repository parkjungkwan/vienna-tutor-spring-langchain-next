package com.bitcamp.api.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitcamp.api.article.model.Article;
import com.bitcamp.api.board.model.Board;

@Repository
public interface BoardRepository  extends JpaRepository<Board, Long>{
    
}
