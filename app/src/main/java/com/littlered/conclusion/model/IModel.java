package com.littlered.conclusion.model;

import com.littlered.conclusion.api.ImageListApi;
import com.littlered.conclusion.api.ImageListenerApi;
import com.littlered.conclusion.api.ImageReq;
import com.littlered.conclusion.api.LoginListenerApi;
import com.littlered.conclusion.api.LoginReq;
import com.littlered.conclusion.api.RegisterListenerApi;
import com.littlered.conclusion.api.RegisterReq;

public interface IModel {
    //请求网络，登录
    void LoginModel(LoginReq map, LoginListenerApi loginListenerApi);
    //请求网络，注册
    void RegisterModel(RegisterReq mapRegister, RegisterListenerApi registerListenerApi);
    //请求网络，查看图片列表
    void ImageListModel(ImageReq imageReq, ImageListenerApi imageListenerApi);
}
