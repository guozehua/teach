package com.tt.teach.controller;

import com.tt.teach.pojo.Subject;
import com.tt.teach.service.SubjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/sub")
public class SubjectController {
    @Resource
    private SubjectService subjectService;

    @RequestMapping("/subject")
    public String subject() {
        return "/subject/subject";
    }

    @RequestMapping("/getSubList")
    @ResponseBody
    public Object getSubList() {
        List<Subject> list=subjectService.getSubList();
        return list;
    }
}
