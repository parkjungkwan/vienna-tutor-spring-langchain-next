package com.bitcamp.api.board.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.bitcamp.api.board.model.BoardDto;
import com.bitcamp.api.board.repository.BoardRepository;
import com.bitcamp.api.common.component.Messenger;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardRepository repository;

    @Override
    public Messenger save(BoardDto t) {
        entityToDto(repository.save(dtoToEntity(t)));
        return new Messenger();
    }

    @Override
    public Messenger deleteById(Long id) {
        repository.deleteById(id);
        return new Messenger();
    }

    @Override
    public Optional<BoardDto> findById(Long id) {
        //return Optional.of(entityToDto(repository.findById(id)));
        return null;
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public Messenger modify(BoardDto t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modify'");
    }

    @Override
    public List<BoardDto> findAll() {
        return repository.findAll().stream().map(i->entityToDto(i)).toList();
    }


   
    
    
    
}
