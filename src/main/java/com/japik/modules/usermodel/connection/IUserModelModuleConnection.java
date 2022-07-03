package com.japik.modules.usermodel.connection;

import com.japik.module.IModuleConnection;

import java.rmi.RemoteException;

public interface IUserModelModuleConnection extends IModuleConnection {

    IUserModel createUser(String username, byte[] pass) throws RemoteException, UserAlreadyExistsException;

    boolean existsUserByUserId(long userId) throws RemoteException;
    boolean existsUserByKeyVal(Object key, Object val) throws RemoteException;

    IUserModel getUserByUserId(long userId) throws RemoteException, UserNotFoundException;
    IUserModel getOneUserByKeyVal(Object key, Object val) throws RemoteException, UserNotFoundException;
    Iterable<IUserModel> getUsersByKeyVal(Object key, Object val) throws RemoteException;
}
