package com.tt.teach.service;

import com.tt.teach.pojo.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> getSubList();

    List<Subject> getGradeList();

    int deleteSub(Integer subjectNo);

    int updateSub(Subject subject);

    int addSub(Subject subject);
}
