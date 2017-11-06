package com.hantele.controller;

import com.hantele.domain.Student;
import com.hantele.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    IStudentService studentService;
    @RequestMapping("/list")
    public Student studentList() {
        //return studentService.getStudentById(sid);
        return null;
    }

    @RequestMapping("/wokao")
    public String wokao(){
        return "wokao";
    }
}
