package com.tt.teach.dao;

import com.tt.teach.pojo.Subject;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SubjectDao {
    @Select("SELECT subject.*,grade.gradeName AS gradeName FROM SUBJECT,grade WHERE subject.gradeID=grade.gradeID")
    List<Subject> getSubList();

    @Select("select * from grade")
    List<Subject> getGradeList();

    @Delete("delete from subject where subjectNo=#{subjectNo}")
    int deleteSub(Integer subjectNo);

    @Update("update subject set subjectName=#{subjectName},classHour=#{classHour} where subjectNo=#{subjectNo}")
    int updateSub(Subject subject);

    @Insert("insert into subject(subjectName,classHour,gradeID) values(#{subjectName},#{classHour},#{gradeID})")
    int addSub(Subject subject);
}
