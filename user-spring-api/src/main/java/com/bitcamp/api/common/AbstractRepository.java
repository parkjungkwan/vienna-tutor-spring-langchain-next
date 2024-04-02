package com.bitcamp.api.common;

import com.bitcamp.api.enums.Messenger;

import java.io.IOException;
import java.util.Map;

public abstract class AbstractRepository {
    public abstract Map<String, ?> save(Map<String, ?> paramMap) throws IOException;
}
