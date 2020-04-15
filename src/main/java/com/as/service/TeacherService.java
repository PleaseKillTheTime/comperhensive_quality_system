package com.as.service;

import com.as.dataobject.Teacher;

public interface TeacherService {
    int deleteByPrimaryKey(Integer id);
    int insert(Teacher record);
    int insertSelective(Teacher record);
    Teacher selectByPrimaryKey(Integer id);
    Teacher selectByTid(String Tid);
    int updateByPrimaryKeySelective(Teacher record);
    int updateByPrimaryKey(Teacher record);

}
