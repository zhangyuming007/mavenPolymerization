package org.openSource.serviceImp;

import org.openSource.dao.UserMapper;
import org.openSource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.openSource.pojo.UserBean;

import javax.annotation.Resource;

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
