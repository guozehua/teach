package com.tt.teach.dao;

import com.tt.teach.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
*@作者：guozehua
*@时间：2018/12/21 19:32
*@描述：
*/
@Mapper
@Repository
public interface StudentDao {
    @Select("select * from student where studentNo=#{studentNo} and loginPwd=#{loginPwd}")
    Student doLogin(Student student);

    //as的别名要和实体类里面的一样
    @Select("select student.*,grade.gradeName as gradeName from student,grade where grade.gradeID=student.gradeId")
    List<Student> getStudentList();

    @Update("update student set loginPwd=#{loginPwd},studentName=#{studentName},phone=#{phone} where studentNo=#{studentNo}")
    int updateStudent(Student student);

    @Delete("delete from student where studentNo=#{stuNo}")
    int deleteStudent(Integer stuNo);


    @Select("select * from student where studentNo=#{studentNo}")
    Student getStuByNo(Integer studentNo);
}
