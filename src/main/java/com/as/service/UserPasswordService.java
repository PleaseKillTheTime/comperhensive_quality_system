package com.as.service;

import com.as.dataobject.UserPassword;

public interface UserPasswordService {
    int deleteByPrimaryKey(String id);
    int insert(UserPassword record);
    int insertSelective(UserPassword record);
    UserPassword selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserPassword record);
    int updateByPrimaryKey(UserPassword record);
}
