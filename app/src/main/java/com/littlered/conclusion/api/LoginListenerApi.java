package com.littlered.conclusion.api;

import com.littlered.conclusion.bean.BaseData;
import com.littlered.conclusion.bean.Data;

public interface LoginListenerApi {
    //成功的方法
    void Success(BaseData<Data> baseData);
    //失败的方法
    void Error(String error);
}
