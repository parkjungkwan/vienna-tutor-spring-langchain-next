package com.bitcamp.api.board.service;

import com.bitcamp.api.board.model.BoardDto;
import com.bitcamp.api.common.service.CommandService;
import com.bitcamp.api.common.service.QueryService;

public interface BoardService extends CommandService<BoardDto>, QueryService<BoardDto>{
    
}
