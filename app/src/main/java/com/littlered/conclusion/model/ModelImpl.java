package com.littlered.conclusion.model;

import android.util.Log;

import com.littlered.conclusion.api.ImageListenerApi;
import com.littlered.conclusion.api.ImageReq;
import com.littlered.conclusion.api.LoginListenerApi;
import com.littlered.conclusion.api.LoginReq;
import com.littlered.conclusion.api.RegisterListenerApi;
import com.littlered.conclusion.api.RegisterReq;
import com.littlered.conclusion.bean.BaseData;
import com.littlered.conclusion.bean.ConstantsUrl;
import com.littlered.conclusion.bean.Data;
import com.littlered.conclusion.bean.Image;
import com.littlered.conclusion.utils.RetrofitUtils;

import java.util.List;

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
                .enqueue(new Callback<BaseData<Data>>() {
                    @Override
                    public void onResponse(Call<BaseData<Data>> call, Response<BaseData<Data>> response) {
                            Log.e( "onResponse: ",response.body().getMsg() );
                            loginListenerApi.Success(response.body());
                    }

                    @Override
                    public void onFailure(Call<BaseData<Data>> call, Throwable t) {
                        Log.e( "onFailure ",t.toString() );
                        loginListenerApi.Error(t.toString());
                    }
                });
    }

    @Override
    public void RegisterModel(RegisterReq mapRegister,final RegisterListenerApi registerListenerApi) {
        OkHttpClient client = new OkHttpClient.Builder().build();
        new RetrofitUtils
                .Builder()
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConvertFactory(GsonConverterFactory.create())
                .build()
                .getRegisterApi()
                .postRegisterRetrofit(ConstantsUrl.register_url,mapRegister)
                .enqueue(new Callback<BaseData<Data>>() {
                    @Override
                    public void onResponse(Call<BaseData<Data>> call, Response<BaseData<Data>> response) {
                        Log.e( "onResponse: ",response.body().getMsg() );
                        registerListenerApi.RegisterSuccess(response.body());
                    }

                    @Override
                    public void onFailure(Call<BaseData<Data>> call, Throwable t) {
                        Log.e( "onFailure ",t.toString() );
                        registerListenerApi.RegisterError(t.toString());
                    }
                });
    }

    @Override
    public void ImageListModel(ImageReq imageReq, final ImageListenerApi imageListenerApi) {
        OkHttpClient client = new OkHttpClient.Builder().build();
        new RetrofitUtils
                .Builder()
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConvertFactory(GsonConverterFactory.create())
                .build()
                .getImageListApi()
                .getImageList(0,8)
                .enqueue(new Callback<BaseData<Image>>() {
                    @Override
                    public void onResponse(Call<BaseData<Image>> call, Response<BaseData<Image>> response) {
                        response.body().getMsg();
                    }

                    @Override
                    public void onFailure(Call<BaseData<Image>> call, Throwable t) {

                    }
                });
    }
}
