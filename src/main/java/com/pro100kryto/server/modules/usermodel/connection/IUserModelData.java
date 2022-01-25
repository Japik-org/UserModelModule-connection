package com.pro100kryto.server.modules.usermodel.connection;

import org.jetbrains.annotations.Nullable;

import java.io.Closeable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IUserModelData extends Remote, Closeable {
    long getUserId() throws RemoteException;

    String getNickname() throws RemoteException;
    void setNickname(String nickname) throws RemoteException;

    byte[] getPassHash() throws RemoteException;
    byte[] getPassSalt() throws RemoteException;
    boolean checkPass(byte[] pass) throws RemoteException;
    void setPass(byte[] pass, byte[] salt) throws RemoteException;

    @Nullable
    Object getUserVal(Object key) throws RemoteException;
    void setUserVal(Object key, Object val) throws RemoteException;

    void close() throws RemoteException;
    boolean isClosed() throws RemoteException;
}
