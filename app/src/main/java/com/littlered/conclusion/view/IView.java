package com.littlered.conclusion.view;

import com.littlered.conclusion.bean.BaseData;
import com.littlered.conclusion.bean.Data;

public interface IView {
    //获取手机号
    String getMobile();
    //获取密码
    String getPassword();

    //手机号格式错误
    void MobileError(String error);
    //密码格式错误
    void PasswordError(String error);
    //网络请求成功，登录成功
    void LoginSuccess(BaseData<Data> baseData);
    //网络请求失败，登录失败
    void LoginFailure(BaseData<Data> baseData);
    //网络请求失败
    void Failure(String error);
}
