package com.bitcamp.api.common.service;
import java.util.List;
import java.util.Optional;

import com.bitcamp.api.common.component.Messenger;

public  interface QueryService<T> {
    List<T> findAll() ;
    Optional<T> findById(Long id);
    Messenger count();
    boolean existsById(Long id);
}
