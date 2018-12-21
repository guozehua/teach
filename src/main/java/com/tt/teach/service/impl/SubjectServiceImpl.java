package com.tt.teach.service.impl;

import com.tt.teach.dao.SubjectDao;
import com.tt.teach.pojo.Subject;
import com.tt.teach.service.SubjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
   @Resource
    private SubjectDao subjectDao;


    @Override
    public List<Subject> getSubList() {
        return subjectDao.getSubList();
    }

    @Override
    public List<Subject> getGradeList() {
        return subjectDao.getGradeList();
    }

    @Transactional
    public int deleteSub(Integer subjectNo) {
        return subjectDao.deleteSub(subjectNo);
    }

    @Transactional
    public int updateSub(Subject subject) {
        return subjectDao.updateSub(subject);

    }

    @Override
    public int addSub(Subject subject) {
        return subjectDao.addSub(subject);
    }
}
