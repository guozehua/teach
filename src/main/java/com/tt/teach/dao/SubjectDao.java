package com.tt.teach.dao;

import com.tt.teach.pojo.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SubjectDao {
    @Select("SELECT subject.*,grade.gradeName AS gradeName FROM SUBJECT,grade WHERE subject.gradeID=grade.gradeID")
    List<Subject> getSubList();
}
