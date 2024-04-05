package com.bitcamp.api.board.service;

import java.util.Optional;

import com.bitcamp.api.board.model.Board;
import com.bitcamp.api.board.model.BoardDto;
import com.bitcamp.api.common.service.CommandService;
import com.bitcamp.api.common.service.QueryService;

public interface BoardService extends CommandService<BoardDto>, QueryService<BoardDto>{
    default Board dtoToEntity(BoardDto dto){
        return Board.builder().build();
    }

    default BoardDto entityToDto(Optional<Board> optional){
        return BoardDto.builder().build();
    }
}
