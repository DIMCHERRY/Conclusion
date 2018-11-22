package com.littlered.conclusion.api;

import com.littlered.conclusion.bean.BaseData;
import com.littlered.conclusion.bean.Data;

public interface RegisterListenerApi {
    //成功的方法
    void RegisterSuccess(BaseData<Data> baseData);
    //失败的方法
    void RegisterError(String error);
}
