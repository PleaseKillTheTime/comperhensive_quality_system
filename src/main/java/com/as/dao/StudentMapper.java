package com.as.dao;

import com.as.dataobject.Student;

public interface StudentMapper {

    int deleteByPrimaryKey(Integer id);
    int insert(Student record);
    int insertSelective(Student record);
    Student selectByPrimaryKey(Integer id);
    Student selectBySid(String Sid);
    int updateByPrimaryKeySelective(Student record);
    int updateByPrimaryKey(Student record);
}