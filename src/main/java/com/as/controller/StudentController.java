package com.as.controller;

import com.as.dataobject.Student;
import com.as.response.CommonReturnType;
import com.as.service.StudentService;
import exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("student")

public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/getAllStudents")
    @ResponseBody
    public List<Student> getAllStudents(){
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
        return  studentService.selectAllStudents();
    }
}
