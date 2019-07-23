package com.yxz.utils.springbootwebutils.domain;

import java.io.Serializable;

/**
 * @Author： yuzx
 * @Description:
 * @DateTime: Created in 2019/7/22 18:13
 */
public class CommonResult implements Serializable {
    private int code;
    private String msg;
    private Object data;

    public CommonResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public CommonResult() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
