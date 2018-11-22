package com.littlered.conclusion.api;

import com.littlered.conclusion.bean.BaseData;
import com.littlered.conclusion.bean.Data;

public interface ImageListenerApi {
    //成功的方法
    void ImageSuccess(BaseData<Data> baseData);
    //失败的方法
    void ImageError(String error);
}
