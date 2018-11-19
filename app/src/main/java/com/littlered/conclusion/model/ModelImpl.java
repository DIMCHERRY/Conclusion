package com.littlered.conclusion.model;

import android.util.Log;

import com.littlered.conclusion.api.LoginListenerApi;
import com.littlered.conclusion.api.LoginReq;
import com.littlered.conclusion.bean.BaseUser;
import com.littlered.conclusion.bean.ConstantsUrl;
import com.littlered.conclusion.bean.User;
import com.littlered.conclusion.utils.RetrofitUtils;

import java.util.Map;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ModelImpl implements IModel {

    @Override
    public void LoginModel(LoginReq map, final LoginListenerApi loginListenerApi) {
        //创建OkhttpClient
        OkHttpClient client = new OkHttpClient.Builder().build();
        //构造链式调用
        new RetrofitUtils
                .Builder()
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConvertFactory(GsonConverterFactory.create())
                .build()
                .getTsetService()
                .postRetrofit(ConstantsUrl.login_url,map)
                .enqueue(new Callback<BaseUser<User>>() {
                    @Override
                    public void onResponse(Call<BaseUser<User>> call, Response<BaseUser<User>> response) {
                            Log.e( "onResponse: ",response.body().getMsg() );
                            loginListenerApi.Success(response.body());
                    }

                    @Override
                    public void onFailure(Call<BaseUser<User>> call, Throwable t) {
                        Log.e( "onFailure ",t.toString() );
                        loginListenerApi.Error(t.toString());
                    }
                });

    }
}
