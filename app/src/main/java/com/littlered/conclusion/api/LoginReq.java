package com.littlered.conclusion.api;

public class LoginReq {
    private String account;
    private String secret;
    private int type;

    public LoginReq(String account, String secret, int type) {
        this.account = account;
        this.secret = secret;
        this.type = type;
    }
}
