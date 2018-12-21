package com.tt.teach.service;

import com.tt.teach.pojo.Student;

import java.util.List;
/**
*@作者：guozehua
*@时间：2018/12/21 19:34
*@描述：
*/

public interface StudentService {


    Student doLogin(Student student);

    List<Student> getStudentList();

    int updateStudent(Student student);

    int deleteStudent(Integer stuNo);

    Student getStuByNo(Integer studentNo);
}
