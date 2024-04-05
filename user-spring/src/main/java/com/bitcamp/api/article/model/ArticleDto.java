package com.bitcamp.api.article.model;

import org.springframework.stereotype.Component;
import lombok.*;
import lombok.extern.log4j.Log4j;


@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {

    private Long id;
    private String title;
    private String content;
    private String registerDate;
    private Long writerId;
    private Long boardId;
    
}
