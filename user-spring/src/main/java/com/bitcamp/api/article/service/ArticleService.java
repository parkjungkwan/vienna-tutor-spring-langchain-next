package com.bitcamp.api.article.service;
import com.bitcamp.api.article.model.ArticleDto;
import com.bitcamp.api.common.service.CommandService;
import com.bitcamp.api.common.service.QueryService;

public interface ArticleService extends CommandService<ArticleDto>, QueryService<ArticleDto>{
    
}
