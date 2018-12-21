package com.tt.teach.service;

import com.tt.teach.pojo.Result;
import com.tt.teach.pojo.Subject;

import java.util.List;
/**
*@作者：guozehua
*@时间：2018/12/21 19:34
*@描述：
*/
public interface ResultSerice {
    List<Result> getResultList();

    int deleteResult(Integer resultNo);

    int updateResult(Result result);

    int addResult(Result result);

    List<Subject> getSubject();
}
