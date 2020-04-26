package com.as.controller;

import com.as.dataobject.Student;
import com.as.response.CommonReturnType;
import com.as.service.StudentService;
import exception.BusinessException;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("student")

public class StudentController {
    @Autowired
    StudentService studentService;

    //查询所有学生信息
    @RequestMapping(value = "/getAllStudents")
    @ResponseBody
    public List<Student> getAllStudents() {
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
        return studentService.selectAllStudents();
    }

    //删除学生信息
    @RequestMapping(value = "/deleteStudent", method = RequestMethod.POST)
    @ResponseBody
    public String deleteStudent(@RequestParam(value = "sid") String sid) {
        System.out.println(sid);
        studentService.deleteByPrimaryKey(sid);
        return "delete success";
    }

    //编辑学生信息
    @RequestMapping(value = "/editStudent", method = RequestMethod.POST)
    @ResponseBody
    public String editStudent(@RequestBody Student student) {
        studentService.updateByPrimaryKey(student);
        return "success";
    }

    //批量删除学生信息
    @RequestMapping(value = "/deleteStudents", method = RequestMethod.POST)
    @ResponseBody
    public String deleteStudents(String[] sids) {
        System.out.println(sids);
        for (String sid : sids) {
            System.out.println(sid);
            studentService.deleteByPrimaryKey(sid);
        }

        return "delete success";
    }
    //selectNameBySid
    @RequestMapping(value = "/selectNameBySid", method = RequestMethod.GET)
    @ResponseBody
    public String selectNameBySid(String sid) {
           return studentService.selectNameBySid(sid);
    }
}