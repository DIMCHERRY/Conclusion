package com.littlered.conclusion.view;

import com.littlered.conclusion.bean.BaseUser;
import com.littlered.conclusion.bean.User;

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
    void LoginSuccess(BaseUser<User> baseUser);
    //网络请求失败，登录失败
    void LoginFailure(BaseUser<User> baseUser);
    //网络请求失败
    void Failure(String error);
}
