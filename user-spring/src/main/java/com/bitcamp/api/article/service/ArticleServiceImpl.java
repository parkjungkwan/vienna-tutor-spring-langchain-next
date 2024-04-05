package com.bitcamp.api.article.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bitcamp.api.article.model.Article;
import com.bitcamp.api.article.model.ArticleDto;
import com.bitcamp.api.article.repository.ArticleRepository;
import com.bitcamp.api.common.component.PageRequestVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService{

    private final ArticleRepository repository;

    @Override
    public ArticleDto save(ArticleDto t) {
        return entityToDto(Optional.of(repository.save(dtoToEntity(t))));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ArticleDto> findAll(PageRequestVo vo) {
        //return repository.findAll(vo);
        return null;
    }

    @Override
    public Optional<ArticleDto> findById(Long id) {
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
