package com.tt.teach.dao;

import com.tt.teach.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentDao {
   @Select("select * from student where studentNo=#{studentNo} and loginPwd=#{loginPwd}")
    Student doLogin(Student student);
   @Select("SELECT * FROM student,grade WHERE grade.gradeID=student.gradeId")
    List<Student> getStudentList();
}
