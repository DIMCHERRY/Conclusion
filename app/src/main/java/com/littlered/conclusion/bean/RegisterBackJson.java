package com.littlered.conclusion.bean;

public class RegisterBackJson {
    /**
     * data : {}
     * error_code : 0
     * msg : 注册成功
     * request : POST /v1/client/register
     */

    private DataBean data;
    private int error_code;
    private String msg;
    private String request;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public static class DataBean {
    }
}
