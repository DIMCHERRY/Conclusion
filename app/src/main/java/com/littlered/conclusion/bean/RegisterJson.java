package com.littlered.conclusion.bean;

public class RegisterJson {

    /**
     * account : 17600261502
     * secret : 123456
     * type : 101
     * nickname : 孟和
     */

    private String account;
    private String secret;
    private int type;
    private String nickname;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public RegisterJson(String account, String secret, int type,String nickname){
        this.account = account;
        this.secret = secret;
        this.type = 101;
        this.nickname = nickname;
    }
}
