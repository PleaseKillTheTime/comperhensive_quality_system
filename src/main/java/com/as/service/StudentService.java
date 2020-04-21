package com.as.service;

import com.as.dataobject.Student;

import java.util.List;

public interface StudentService {

    int insert(Student record);
    int insertSelective(Student record);

    List<Student> selectAllStudents();
    int deleteByPrimaryKey(String sid);
    int updateByPrimaryKeySelective(Student record);
    int updateByPrimaryKey(Student record);
}
