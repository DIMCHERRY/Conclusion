package com.littlered.conclusion.model;

import com.littlered.conclusion.api.LoginListenerApi;
import com.littlered.conclusion.api.LoginReq;

import java.util.Map;

public interface IModel {
    //请求网络，为登录做准备
    void LoginModel(LoginReq map, LoginListenerApi loginListenerApi);
}
