package com.as.controller;

import com.as.dao.UserPasswordMapper;
import com.as.dataobject.UserPassword;
import com.as.service.Model.UserModel;
import com.as.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller("user")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private
    UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public UserModel
    getUser(@RequestParam(name="id")Integer id){
        UserModel userModel = userService.getUserById(id);
        return  userModel;

    }
}
