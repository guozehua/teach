package com.tt.teach.controller;

import com.tt.teach.service.ResultSerice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/res")
public class ResultController {
   @Resource
    private ResultSerice resultSerice;

    public String toString() {
        return super.toString();
    }
}
