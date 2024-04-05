package com.bitcamp.api.board.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.bitcamp.api.board.model.BoardDto;
import com.bitcamp.api.board.repository.BoardRepository;
import com.bitcamp.api.common.component.PageRequestVo;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardRepository repository;

    @Override
    public BoardDto save(BoardDto t) {
        return entityToDto(Optional.of(repository.save(dtoToEntity(t))));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<BoardDto> findAll(PageRequestVo vo) {
        //return repository.findAll(vo);
        return null;
    }

    @Override
    public Optional<BoardDto> findById(Long id) {
        return Optional.of(entityToDto(repository.findById(id)));
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

   
    
    
    
}
