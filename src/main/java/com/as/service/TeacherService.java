package com.as.service;

import com.as.dataobject.Teacher;

import java.util.List;

public interface TeacherService {
    int deleteByPrimaryKey(String id);
    int insert(Teacher record);
    int insertSelective(Teacher record);
    Teacher selectByPrimaryKey(String id);
    List<Teacher> getAllTeachers();
    int updateByPrimaryKeySelective(Teacher record);
    int updateByPrimaryKey(Teacher record);

}
