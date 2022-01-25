package com.pro100kryto.server.modules.usermodel.connection;

import com.pro100kryto.server.module.IModuleConnection;

import java.rmi.RemoteException;

public interface IUserModelModuleConnection extends IModuleConnection {

    IUserModelData createUser(String nickname, String email, byte[] pass) throws RemoteException;

    boolean existsUserByUserId(long userId) throws RemoteException;
    boolean existsUserByKeyVal(Object key, Object val) throws RemoteException;

    IUserModelData getUserByUserId(long userId) throws RemoteException, UserNotFoundException;
    IUserModelData getUserByKeyVal(Object key, Object val) throws RemoteException, UserNotFoundException;

}
