package com.tt.teach.dao;

import com.tt.teach.pojo.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface ResultDao {

    @Select("SELECT result.*,student.studentName AS studentName,`subject`.subjectName AS subjectName FROM student,`subject`,result WHERE result.subjectNo=`subject`.subjectNo AND result.studentNo=student.studentNo ORDER BY result.examDate DESC\n")
    List<Result> getResultList();
}
