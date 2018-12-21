package com.tt.teach.service.impl;

import com.tt.teach.dao.StudentDao;
import com.tt.teach.pojo.Student;
import com.tt.teach.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
/**
*@作者：guozehua
*@时间：2018/12/21 19:33
*@描述：
*/
@Service
public class StudentServiceImpl implements StudentService {
   @Resource
    private StudentDao studentDao;


    @Override
    public Student doLogin(Student student) {
        return studentDao.doLogin(student);
    }

    @Override
    public List<Student> getStudentList() {
        return studentDao.getStudentList();
    }

    @Transactional
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Transactional
    public int deleteStudent(Integer stuNo) {
        return studentDao.deleteStudent(stuNo);
    }

    @Override
    public Student getStuByNo(Integer studentNo) {
        return studentDao.getStuByNo(studentNo);
    }
}
