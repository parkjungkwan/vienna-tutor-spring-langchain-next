package com.bitcamp.api.common.service;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.bitcamp.api.common.component.PageRequestVo;
public  interface QueryService<T> {
    List<T> findAll(PageRequestVo vo) ;
    Optional<T> findById(Long id);
    long count();
    boolean existsById(Long id);
}
