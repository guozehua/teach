package com.tt.teach.utils;
/**
*@作者：guozehua
*@时间：2018/12/21 19:34
*@描述：
*/
public class JsonResult {
    //响应状态码
    private Integer status;
    //响应的消息
    private String msg;
    //响应的数据
    private Object myData;

    public JsonResult() {
    }

    public JsonResult(Integer status, String msg, Object myData) {
        this.status = status;
        this.msg = msg;
        this.myData = myData;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getMyData() {
        return myData;
    }

    public void setMyData(Object myData) {
        this.myData = myData;
    }
   //成功的时候调用
    public static JsonResult ok(String msg, Object myData) {
        return new JsonResult(200, msg, myData);
    }

    public static JsonResult no(String msg, Object myData) {
        return new JsonResult(502, msg, myData);
    }
}
