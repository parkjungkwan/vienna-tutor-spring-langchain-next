package com.bitcamp.api.article;


import com.bitcamp.api.common.AbstractService;
import com.bitcamp.api.enums.Messenger;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ArticleServiceImpl extends AbstractService {
    private final static ArticleServiceImpl instance = new ArticleServiceImpl();
    private ArticleRepository repository;

    private ArticleServiceImpl() {
        repository = ArticleRepository.getInstance();
    }

    public static ArticleServiceImpl getInstance() {
        return instance;
    }

    @Override
    public Messenger save(Object o) {
        return null;
    }

    @Override
    public List findAll() throws SQLException {
        return repository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return Optional.empty();
    }

    @Override
    public String count() {
        return null;
    }

    @Override
    public Optional getOne(String id) {
        return Optional.empty();
    }

    @Override
    public String delete(Object o) {
        return null;
    }

    @Override
    public Boolean existsById(Long id) {
        return null;
    }
}
