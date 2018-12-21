package com.tt.teach.service.impl;

import com.tt.teach.dao.ResultDao;
import com.tt.teach.pojo.Result;
import com.tt.teach.pojo.Subject;
import com.tt.teach.service.ResultSerice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
/**
*@作者：guozehua
*@时间：2018/12/21 19:32
*@描述：
*/
@Service
public class ResultServiceImpl implements ResultSerice {
    @Resource
    private ResultDao resultDao;

    @Override
    public List<Result> getResultList() {
        return resultDao.getResultList();
    }

    @Transactional
    public int deleteResult(Integer resultNo) {
        return resultDao.deleteResult(resultNo);
    }

    @Transactional
    public int updateResult(Result result) {
        return resultDao.updateResult(result);
    }

    @Transactional
    public int addResult(Result result) {
        return resultDao.addResult(result);
    }

    @Override
    public List<Subject> getSubject() {
        return resultDao.getSubject();
    }


}
