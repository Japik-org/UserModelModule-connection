package com.pro100kryto.server.modules.usermodel.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserAlreadyExistsException extends Exception {
    private final Object key;
    private final Object val;
}
