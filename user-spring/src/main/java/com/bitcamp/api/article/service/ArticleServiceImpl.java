package com.bitcamp.api.article.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bitcamp.api.article.model.Article;
import com.bitcamp.api.article.model.ArticleDto;
import com.bitcamp.api.article.repository.ArticleRepository;
import com.bitcamp.api.common.component.Messenger;
import com.bitcamp.api.common.component.PageRequestVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService{

    private final ArticleRepository repository;

    @Override
    public Messenger save(ArticleDto t) {
        entityToDto(repository.save(dtoToEntity(t)));
        return new Messenger();
    }

    @Override
    public Messenger deleteById(Long id) {
        repository.deleteById(id);
        return new Messenger();
    }

    @Override
    public List<ArticleDto> findAll() { 
        return repository.findAll().stream().map(i->entityToDto(i)).toList();
    }

    @Override
    public Optional<ArticleDto> findById(Long id) {
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
    public Messenger modify(ArticleDto t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modify'");
    }


   
    
}
