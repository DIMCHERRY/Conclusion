package com.littlered.conclusion.api;

import com.littlered.conclusion.bean.BaseUser;
import com.littlered.conclusion.bean.User;

public interface LoginListenerApi {
    //成功的方法
    void Success(BaseUser<User> baseUser);
    //失败的方法
    void Error(String error);
}
