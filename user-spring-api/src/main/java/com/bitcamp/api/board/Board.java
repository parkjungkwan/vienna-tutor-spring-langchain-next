package com.bitcamp.api.board;

import java.util.List;
import com.bitcamp.api.article.Article;
import jakarta.persistence.OneToMany;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class Board {
    private Long id;
    private String boardName;
    private String boardType;

    @OneToMany(mappedBy = "board")
    private List<Article> articles;


    @Builder(builderMethodName = "builder")
    public Board(String boardName, String boardType) {
        this.boardName = boardName;
        this.boardType = boardType;
    }
}
