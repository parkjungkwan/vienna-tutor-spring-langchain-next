package com.bitcamp.api.common.service;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.bitcamp.api.common.component.PageRequestVo;
public  interface QueryService<T> {
    List<T> findAll(PageRequestVo vo) throws SQLException;
    Optional<T> findById(Long id);
    String count();
    Optional<T> getOne(String id);
    Boolean existsById(Long id);
}
