package com.hantele.service.impl;

import com.hantele.dao.StudentMapper;
import com.hantele.domain.Student;
import com.hantele.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    StudentMapper studentMapper;
    @Override
    public List<Student> listStudent() {
        return studentMapper.selectAll();
    }

    @Override
    public Student getStudentById(int sid) {
        return studentMapper.selectByPrimaryKey(sid);
    }
}
