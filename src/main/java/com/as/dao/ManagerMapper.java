package com.as.dao;

import com.as.dataobject.Manager;

public interface ManagerMapper {

    int deleteByPrimaryKey(Integer id);
    int insert(Manager record);
    int insertSelective(Manager record);
    Manager selectByPrimaryKey(Integer id);
    Manager selectByMid(String Mid);
    int updateByPrimaryKeySelective(Manager record);
    int updateByPrimaryKey(Manager record);
}