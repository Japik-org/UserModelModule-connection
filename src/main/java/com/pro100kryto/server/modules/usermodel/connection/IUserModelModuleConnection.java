package com.pro100kryto.server.modules.usermodel.connection;

import com.pro100kryto.server.module.IModuleConnection;

import java.rmi.RemoteException;

public interface IUserModelModuleConnection extends IModuleConnection {

    IUserModel createUser(String username, byte[] pass) throws RemoteException, UserAlreadyExistsException;

    boolean existsUserByUserId(long userId) throws RemoteException;
    boolean existsUserByKeyVal(Object key, Object val) throws RemoteException;

    IUserModel getUserByUserId(long userId) throws RemoteException, UserNotFoundException;
    IUserModel getOneUserByKeyVal(Object key, Object val) throws RemoteException, UserNotFoundException;
    Iterable<IUserModel> getUsersByKeyVal(Object key, Object val) throws RemoteException;
}
