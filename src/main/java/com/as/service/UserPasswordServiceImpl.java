package com.as.service;

import com.as.dao.UserPasswordMapper;
import com.as.dataobject.UserPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPasswordServiceImpl implements  UserPasswordService {
    @Autowired
    UserPasswordMapper userPasswordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userPasswordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserPassword record) {
        return userPasswordMapper.insert(record);
    }

    @Override
    public int insertSelective(UserPassword record) {
        return userPasswordMapper.insertSelective(record);
    }

    @Override
    public UserPassword selectByPrimaryKey(Integer id) {
        return userPasswordMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserPassword selectByUserId(String userId) {
        return userPasswordMapper.selectByUserId(userId);

    }

    @Override
    public int updateByPrimaryKeySelective(UserPassword record) {
        return userPasswordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserPassword record) {
        return userPasswordMapper.updateByPrimaryKey(record);
    }
}
