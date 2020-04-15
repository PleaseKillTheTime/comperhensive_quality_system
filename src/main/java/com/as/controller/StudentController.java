package com.as.controller;

import com.as.response.CommonReturnType;
import exception.BusinessException;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller("student")
@RequestMapping("/student")
public class StudentController {
    @RequestMapping(value = "/")
    @ResponseBody
    public CommonReturnType login(/*@RequestBody Users user*/) throws BusinessException {
//        String name = user.getName();
//        String password = user.getPassword();
//
//        if(org.apache.commons.lang3.StringUtils.isEmpty(name)||
//                org.apache.commons.lang3.StringUtils.isEmpty(password)){
//            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
//        }
//
//        userService.login(name,password);
//        User result = userService.SelectUserByName(name);
//        this.httpServletRequest.getSession().setAttribute("IS_LOGIN",true);
//        this.httpServletRequest.getSession().setAttribute("LOGIN_USER",name);
//        return  CommonReturnType.creat(result);
        return  CommonReturnType.creat(null);
    }
}
