package com.tt.teach.service.impl;

import com.tt.teach.dao.ResultDao;
import com.tt.teach.service.ResultSerice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ResultServiceImpl implements ResultSerice {
    @Resource
    private ResultDao resultDao;
}
