package com.pro100kryto.server.modules.usermodel.connection;

import org.jetbrains.annotations.Nullable;

import java.io.Closeable;

public interface IUserModelData extends Closeable {
    long getUserId();

    String getNickname();
    void setNickname(String nickname);

    byte[] getPassHash();
    byte[] getPassSalt();
    boolean checkPass(byte[] pass);
    void setPass(byte[] pass, byte[] salt);

    boolean checkSign(byte[] sign, byte[] src);

    @Nullable
    Object getUserVal(Object key);
    void setUserVal(Object key, Object val);

    void close();
    boolean isClosed();
}
