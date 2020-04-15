package com.as.service;

import com.as.dataobject.Manager;

public interface ManagerService {
    int deleteByPrimaryKey(Integer id);
    int insert(Manager record);
    int insertSelective(Manager record);
    Manager selectByPrimaryKey(Integer id);
    Manager selectByMid(String Mid);
    int updateByPrimaryKeySelective(Manager record);
    int updateByPrimaryKey(Manager record);
}
