package com.as.controller;

import com.as.dao.UserPasswordMapper;
import com.as.dataobject.User;
import com.as.dataobject.UserPassword;
import com.as.error.EmBusinessError;
import com.as.response.CommonReturnType;
import com.as.service.UserPasswordService;
import exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
//    @Autowired
//    TeacherService teacherService;
//    @Autowired
//    StudentService studentService;
//    @Autowired
//    ManagerService managerService;
    @Autowired
      UserPasswordService userPasswordService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public UserPassword login(@RequestBody User user) throws BusinessException {
        //去前段验证下是否可以访问数据
        //这里的name是user_id
        //还是改成user_id吧 后面好用一点
        System.out.println(user.toString());
        String userId = user.getUserId();
        String password = user.getPassword();
        System.out.println(userId+"============"+password);
        //判断是否为空
        if(org.apache.commons.lang3.StringUtils.isEmpty(userId)||
                org.apache.commons.lang3.StringUtils.isEmpty(password)){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        UserPassword userPassword = userPasswordService.selectByUserId(userId);
        if (password.equals(userPassword.getPassword())){
            //一会儿要返回对象（学生or老师or管理员）
            //前端根据返回的信息进入不同的界面]

            return  userPassword;}
//        User result = userService.SelectUserByName(name);
//        this.httpServletRequest.getSession().setAttribute("IS_LOGIN",true);
//        this.httpServletRequest.getSession().setAttribute("LOGIN_USER",name);
//        return  CommonReturnType.creat(result);
       return  null;

    }
}
