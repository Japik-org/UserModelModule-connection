package com.japik.modules.usermodel.connection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Closeable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface IUserModel extends Remote, Closeable {
    long getId() throws RemoteException;

    String getUsername() throws RemoteException;
    void setUsername(String username) throws RemoteException;

    void setPass(byte[] pass) throws RemoteException;
    boolean checkPass(byte[] pass) throws RemoteException;

    @Nullable
    Object getVal(Object key) throws RemoteException;
    void setVal(@NotNull Object key, Object val) throws RemoteException;
    void setAllVal(Map<Object, Object> values) throws RemoteException;

    void close() throws RemoteException;
    boolean isClosed() throws RemoteException;
}
