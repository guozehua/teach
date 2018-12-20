package com.tt.teach.pojo;

import java.io.Serializable;
/**
*  @作者：xuyun
*  @时间：2018/12/19 14:34
*  @描述：年级表
*
*/
public class Grade implements Serializable {

  private Integer  gradeID;//年级ID
    private String gradeName;

    public Grade(Integer gradeID, String gradeName) {
        this.gradeID = gradeID;
        this.gradeName = gradeName;
    }

    public Grade() {
    }

    public Integer getGradeID() {
        return gradeID;
    }

    public void setGradeID(Integer gradeID) {
        this.gradeID = gradeID;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
}
