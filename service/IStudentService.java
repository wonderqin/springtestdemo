package com.hantele.service;

import com.hantele.domain.Student;

import java.util.List;

public interface IStudentService {
    List<Student> listStudent();

    Student getStudentById(int sid);
}
