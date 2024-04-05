package com.bitcamp.api.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Getter
public enum ErrorCode {
    AUTHENTICATION_FAILED(401, "AUTH_001", "AUTHENTICATION_FAILED"), LOGIN_FAILED(401, "AUTH_002", "LOGIN_FAILED"),
    ACCESS_DENIED(401, "AUTH_003", "ACCESS_DENIED"),
    TOKEN_GENERATION_FAILED(500, "AUTH_005", "TOKEN_GENERATION_FAILED");
    private final int status;
    private final String code;
    private final String message;
}