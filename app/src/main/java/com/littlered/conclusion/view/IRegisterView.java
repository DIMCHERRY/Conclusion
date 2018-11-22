package com.littlered.conclusion.view;

import com.littlered.conclusion.bean.BaseData;
import com.littlered.conclusion.bean.Data;

public interface IRegisterView {
    //获取手机号
    String getMobile();
    //获取密码
    String getPassword();
    //获取用户名
    String getNickName();
    //手机号格式错误
    void MobileError(String error);
    //密码格式错误
    void PasswordError(String error);
    //网络请求成功，登录成功
    void RegisterSuccess(BaseData<Data> baseData);
    //网络请求失败，登录失败
    void RegisterFailure(BaseData<Data> baseData);
    //网络请求失败
    void Failure(String error);
}
