package com.as.controller;

import com.as.dataobject.Student;
import com.as.dataobject.Teacher;
import com.as.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    //查询所有教师信息
    @RequestMapping(value = "/getAllTeachers")
    @ResponseBody
    public List<Teacher> getAllSTeachers() {
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
        return teacherService.getAllTeachers();
    }

    //删除教师信息
    @RequestMapping(value = "/deleteTeacher", method = RequestMethod.POST)
    @ResponseBody
    public String deleteStudent(@RequestParam(value = "tid") String tid) {
        System.out.println(tid);
        teacherService.deleteByPrimaryKey(tid);
        return "delete success";
    }

    //编辑学生信息
    @RequestMapping(value = "/editTeacher", method = RequestMethod.POST)
    @ResponseBody
    public String editTeacher(@RequestBody Teacher teacher) {
        teacherService.updateByPrimaryKey(teacher);
        return "success";
    }

    //批量删除学生信息
    @RequestMapping(value = "/deleteTeachers", method = RequestMethod.POST)
    @ResponseBody
    public String deleteTeachers(String[] tids) {
        System.out.println(tids);
        for (String tid : tids) {
            System.out.println(tid);
            teacherService.deleteByPrimaryKey(tid);
        }

        return "delete success";
    }
}
