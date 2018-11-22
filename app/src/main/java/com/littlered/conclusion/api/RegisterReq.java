package com.littlered.conclusion.api;

public class RegisterReq {
    private String account;
    private String secret;
    private String nickname;
    private int type;

    public RegisterReq(String account, String secret, String nickname, int type) {
        this.account = account;
        this.secret = secret;
        //字段名必须与请求服务器字段命名一致
        this.nickname = nickname;
        this.type = type;
    }
}
