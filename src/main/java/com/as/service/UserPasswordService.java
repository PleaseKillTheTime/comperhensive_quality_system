package com.as.service;

import com.as.dataobject.UserPassword;

public interface UserPasswordService {
    int deleteByPrimaryKey(Integer id);
    int insert(UserPassword record);
    int insertSelective(UserPassword record);
    UserPassword selectByPrimaryKey(Integer id);
    UserPassword selectByUserID(String userId);
    int updateByPrimaryKeySelective(UserPassword record);
    int updateByPrimaryKey(UserPassword record);
}
