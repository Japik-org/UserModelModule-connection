package com.pro100kryto.server.modules.usermodel.connection;

import com.pro100kryto.server.module.IModuleConnection;

public interface IUserModelModuleConnection extends IModuleConnection {

    IUserModelData createUser(String nickname, byte[] pass);

    boolean existsUserByUserId(long userId);
    boolean existsUserByKeyVal(Object key, Object val);

    IUserModelData getUserByUserId(long userId) throws UserNotFoundException;
    IUserModelData getUserByKeyVal(Object key, Object val) throws UserNotFoundException;

}
