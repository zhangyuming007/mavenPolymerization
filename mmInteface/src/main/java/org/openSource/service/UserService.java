package org.openSource.service;

import org.openSource.pojo.UserBean;

public interface UserService {

    public abstract UserBean selectOne(int id);

}
