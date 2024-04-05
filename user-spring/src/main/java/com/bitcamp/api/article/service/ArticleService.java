package com.bitcamp.api.article.service;
import java.util.Optional;

import com.bitcamp.api.article.model.Article;
import com.bitcamp.api.article.model.ArticleDto;
import com.bitcamp.api.common.service.CommandService;
import com.bitcamp.api.common.service.QueryService;

public interface ArticleService extends CommandService<ArticleDto>, QueryService<ArticleDto>{

    default Article dtoToEntity(ArticleDto dto){
        return Article.builder().build();
    }

    default ArticleDto entityToDto(Optional<Article> optional){
        return ArticleDto.builder().build();
    }
    
}
