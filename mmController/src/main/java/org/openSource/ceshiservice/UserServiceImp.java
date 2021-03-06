package org.openSource.ceshiservice;

import org.openSource.ceshidao.UserMapper;
import org.openSource.pojo.UserBean;
import org.openSource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean selectOne(int id) {
        System.out.println("serviceImp进来了");
        UserBean ub = userMapper.selectOne(1);
        System.out.println("ub=" + ub);
        return userMapper.selectOne(1);
    }
}
