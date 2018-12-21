package com.tt.teach.service.impl;

import com.tt.teach.dao.SubjectDao;
import com.tt.teach.pojo.Subject;
import com.tt.teach.service.SubjectService;
import org.springframework.stereotype.Service;

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
}
