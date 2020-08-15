package com.miracle.springbootvue.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: vueblog-project
 * @description: 结果封装
 * @author: miracle
 * @create: 2020-08-07 20:22
 **/
@Data
public class Result implements Serializable {

    private int code; // 200是正常，非200表示异常
    private String msg;
    private Object data;

    public static Result success(Object data) {
        return success(200, "操作成功", data);
    }
    public static Result success(String msg, Object data) {
        Result r = new Result();
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result success(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(String msg) {
        return fail(400, msg, null);
    }

    public static Result fail(String msg, Object data) {
        return fail(400, msg, data);
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

}
