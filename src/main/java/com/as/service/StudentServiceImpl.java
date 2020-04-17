package com.as.service;

import com.as.dao.StudentMapper;
import com.as.dataobject.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService {
    @Autowired
    StudentMapper studentMapper;


    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insert(record);
    }



    @Override
    public List<Student> selectAllStudents() {
        return  studentMapper.selectAllStudents();
    }

    @Override
    public Student selectBySid(String Sid) {
        return studentMapper.selectBySid(Sid);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }
}
