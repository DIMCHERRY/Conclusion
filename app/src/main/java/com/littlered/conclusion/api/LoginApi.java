package com.littlered.conclusion.api;

import com.littlered.conclusion.bean.BaseUser;
import com.littlered.conclusion.bean.User;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface LoginApi {
    @POST
    Call<BaseUser<User>> postRetrofit(@Url String url, @Body LoginReq map);
}
