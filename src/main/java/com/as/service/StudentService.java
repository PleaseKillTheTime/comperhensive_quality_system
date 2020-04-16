package com.as.service;

import com.as.dataobject.Student;

import java.util.List;

public interface StudentService {
    int deleteByPrimaryKey(Integer id);
    int insert(Student record);
    int insertSelective(Student record);
    Student selectByPrimaryKey(Integer id);
    List<Student> selectAllStudents();
    Student selectBySid(String Sid);
    int updateByPrimaryKeySelective(Student record);
    int updateByPrimaryKey(Student record);
}
