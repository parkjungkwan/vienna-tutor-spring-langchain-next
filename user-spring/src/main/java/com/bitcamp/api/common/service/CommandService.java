package com.bitcamp.api.common.service;

import com.bitcamp.api.common.component.Messenger;

public interface CommandService<T> {
    Messenger save(T t);
    Messenger deleteById(Long id);
    Messenger modify(T t);


}
