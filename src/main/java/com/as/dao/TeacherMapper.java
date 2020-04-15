package com.as.dao;

import com.as.dataobject.Teacher;

public interface TeacherMapper {

    int deleteByPrimaryKey(Integer id);
    int insert(Teacher record);
    int insertSelective(Teacher record);
    Teacher selectByTid(String Tid);
    Teacher selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Teacher record);
    int updateByPrimaryKey(Teacher record);
}