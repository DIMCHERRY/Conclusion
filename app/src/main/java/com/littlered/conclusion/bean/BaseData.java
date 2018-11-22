package com.littlered.conclusion.bean;

import java.util.List;

//返回json参数实体类
public class BaseData<T> {
    private String msg;
    private String error_code;
    private T data;

    public String getMsg()
    {
        return msg;
    }


    public String getError_code()
    {
        return error_code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
