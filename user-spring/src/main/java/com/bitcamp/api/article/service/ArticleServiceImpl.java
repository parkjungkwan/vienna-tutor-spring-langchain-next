package com.bitcamp.api.article.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;

import com.bitcamp.api.article.model.Article;
import com.bitcamp.api.article.model.ArticleDto;
import com.bitcamp.api.article.repository.ArticleRepository;
import com.bitcamp.api.common.component.Messenger;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService{

    private final ArticleRepository repository;

    @Override
    public Messenger save(ArticleDto dto) {
        Article ent = repository.save(dtoToEntity(dto));
        System.out.println(" ============ BoardServiceImpl save instanceof =========== ");
        System.out.println((ent instanceof Article) ? "SUCCESS" : "FAILURE");
        return Messenger.builder()
        .message((ent instanceof Article) ? "SUCCESS" : "FAILURE")
        .build();
    }

    @Override
    public Messenger deleteById(Long id) {
        return Messenger.builder()
        .message(
            Stream.of(id)
            .filter(i -> existsById(i))
            .peek(i -> repository.deleteById(i))
            .map(i -> "SUCCESS")
            .findAny()
            .orElseGet(() -> "FAILURE")
        )
        .build();
    }

    @Override
    public List<ArticleDto> findAll() { 
        return repository.findAll().stream().map(i->entityToDto(i)).toList();
    }

    @Override
    public Optional<ArticleDto> findById(Long id) {
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
    public Messenger modify(ArticleDto dto) {
        Article ent = repository.save(dtoToEntity(dto));
        System.out.println(" ============ BoardServiceImpl modify instanceof =========== ");
        System.out.println((ent instanceof Article) ? "SUCCESS" : "FAILURE");
        return Messenger.builder()
        .message((ent instanceof Article) ? "SUCCESS" : "FAILURE")
        .build();
    }


   
    
}
