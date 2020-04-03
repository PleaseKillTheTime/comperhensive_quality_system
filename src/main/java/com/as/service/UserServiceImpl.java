package com.as.service;

import com.as.dao.UserMapper;
import com.as.dao.UserPasswordMapper;
import com.as.dataobject.User;
import com.as.dataobject.UserPassword;

import com.as.service.Model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserPasswordMapper userPasswordMapper;
    @Override
    public UserModel getUserById(Integer id) {
        User user =userMapper.selectByPrimaryKey(id);
        if(user==null){
            return null;
        }
        UserPassword userPassword = userPasswordMapper.selectByUserId(user.getId());
        return  convertFromUser(user,userPassword);
    }
    private  UserModel convertFromUser(User user,UserPassword userPassword){
        if(user==null){
            return  null;
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(user,userModel);
        if (userPassword!=null) {
            userModel.setPassword(userPassword.getPassword());
        }

        return userModel;
    }
}
