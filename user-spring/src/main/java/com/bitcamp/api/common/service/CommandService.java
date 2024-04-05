package com.bitcamp.api.common.service;


public interface CommandService<T> {
    void dummy();
    T save(T t);
    T delete(T t);


}
