package com.tt.teach.controller;

import com.tt.teach.pojo.Subject;
import com.tt.teach.service.SubjectService;
import com.tt.teach.utils.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/sub")
public class SubjectController {
    @Resource
    private SubjectService subjectService;

    @RequestMapping("/subject")
    public String subject(Model model) {
        model.addAttribute("gradeList",getGradeList());
        return "/subject/subject";
    }

    @RequestMapping("/getGradeList")
    @ResponseBody
    public Object getGradeList() {
        List<Subject> list=subjectService.getGradeList();
        return list;
    }


    @RequestMapping("/getSubList")
    @ResponseBody
    public Object getSubList() {
        List<Subject> list=subjectService.getSubList();
        return list;
    }

    @RequestMapping(value = "/deleteSub/{subjectNo}",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteSub(@PathVariable Integer subjectNo) {
        int result=subjectService.deleteSub(subjectNo);
        if(result>0){
            return JsonResult.ok("删除成功",result);
        }else{
            return JsonResult.ok("删除失败",result);
        }

    }
    @RequestMapping(value = "/updateSub",method = RequestMethod.PUT)
    @ResponseBody
    public Object updateSub(@RequestParam Integer subjectNo,@RequestParam Integer classHour,@RequestParam String subjectName) {
        Subject subject=new Subject();
        subject.setClassHour(classHour);
        subject.setSubjectName(subjectName);
        subject.setSubjectNo(subjectNo);
        int result=subjectService.updateSub(subject);
        if(result>0){
            return JsonResult.ok("修改成功",result);
        }else{
            return JsonResult.ok("修改失败",result);
        }

    }
    @RequestMapping(value = "/addSub",method = RequestMethod.PUT)
    @ResponseBody
    public Object addSub(@RequestParam Integer gradeID,@RequestParam Integer classHour,@RequestParam String subjectName) {
        Subject subject=new Subject();
        subject.setClassHour(classHour);
        subject.setSubjectName(subjectName);
        subject.setGradeID(gradeID);
        int result=subjectService.addSub(subject);
        if(result>0){
            return JsonResult.ok("添加成功",result);
        }else{
            return JsonResult.ok("添加失败",result);
        }

    }
}
