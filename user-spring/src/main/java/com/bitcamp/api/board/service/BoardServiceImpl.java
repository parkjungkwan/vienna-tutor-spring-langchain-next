package com.bitcamp.api.board.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.bitcamp.api.board.model.Board;
import com.bitcamp.api.board.model.BoardDto;
import com.bitcamp.api.board.repository.BoardRepository;
import com.bitcamp.api.common.component.Messenger;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardRepository repository;

    @Override
    public Messenger save(BoardDto dto) {
        Board ent = repository.save(dtoToEntity(dto));
        System.out.println(" ============ BoardServiceImpl save instanceof =========== ");
        System.out.println((ent instanceof Board) ? "SUCCESS" : "FAILURE");
        return Messenger.builder()
        .message((ent instanceof Board) ? "SUCCESS" : "FAILURE")
        .build();
    }

    @Override
    public Messenger deleteById(Long id) {
        repository.deleteById(id);
        return new Messenger();
    }

    @Override
    public Optional<BoardDto> findById(Long id) {
        return repository.findById(id).map(i -> entityToDto(i));
    }

    @Override
    public Messenger count() {
        return Messenger.builder()
        .message(repository.count()+"")
        .build();
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public Messenger modify(BoardDto dto) {
        Board ent = repository.save(dtoToEntity(dto));
        System.out.println(" ============ BoardServiceImpl modify instanceof =========== ");
        System.out.println((ent instanceof Board) ? "SUCCESS" : "FAILURE");
        return Messenger.builder()
        .message((ent instanceof Board) ? "SUCCESS" : "FAILURE")
        .build();
    }

    @Override
    public List<BoardDto> findAll() {
        return repository.findAll().stream().map(i->entityToDto(i)).toList();
    }


   
    
    
    
}
