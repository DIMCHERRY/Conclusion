package com.littlered.conclusion.api;

import com.littlered.conclusion.bean.BaseData;
import com.littlered.conclusion.bean.Data;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface LoginApi {
    @POST
    Call<BaseData<Data>> postRetrofit(@Url String url, @Body LoginReq map);
}
