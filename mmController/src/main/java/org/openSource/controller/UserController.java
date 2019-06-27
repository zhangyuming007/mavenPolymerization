package org.openSource.controller;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.openSource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.openSource.pojo.UserBean;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(value = "userController")
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/one")
    @ResponseBody
    public UserBean getUser() {
        System.out.println(232124342);
        System.out.println(userService);
        UserBean ub = userService.selectOne(1);
        System.out.println(ub);
        return ub;
    }

    @RequestMapping(value = "/login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "/guahao")
    public String guaHao(
            @RequestParam(value = "id", defaultValue = "-1") int id
    ) {


        return "";
    }

}
