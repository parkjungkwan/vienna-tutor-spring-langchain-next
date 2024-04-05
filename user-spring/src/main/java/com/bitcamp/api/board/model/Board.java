package com.bitcamp.api.board.model;

import java.util.List;
import jakarta.persistence.*;

import com.bitcamp.api.article.model.Article;
import com.bitcamp.api.common.model.BaseEntity;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name = "boards")
public class Board extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private long id;
    private String boardName;
    private String boardType;

    @OneToMany(mappedBy = "board")
    private List<Article> articles;

    @Builder(builderMethodName = "builder")
    public Board(long id, String boardName, String boardType) {
        this.id = id;
        this.boardName = boardName;
        this.boardType = boardType;
    }


}
