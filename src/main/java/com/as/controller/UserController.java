package com.as.controller;

import com.as.dao.UserPasswordMapper;
import com.as.dataobject.UserPassword;
import com.as.error.EmBusinessError;
import com.as.response.CommonReturnType;
import com.as.service.Model.UserModel;
import com.as.service.UserService;
import exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller("user")
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public CommonReturnType getUser(@RequestParam(name="id")Integer id) throws BusinessException {
        UserModel userModel = userService.getUserById(id);
        if(userModel==null){
            throw new BusinessException(EmBusinessError.USER_NOT_EXIT);
        }
        CommonReturnType type = new CommonReturnType();
        return  type.creat(userModel);

    }
}
