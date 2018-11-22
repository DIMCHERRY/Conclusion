package com.littlered.conclusion.utils;

import com.littlered.conclusion.api.ImageListApi;
import com.littlered.conclusion.api.LoginApi;
import com.littlered.conclusion.api.RegisterApi;
import com.littlered.conclusion.bean.ConstantsUrl;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitUtils {
    private static LoginApi loginApi;
    private static RegisterApi registerApi;
    private static ImageListApi imageListApi;
    //声明私有构造方法,利于单例模式,让调用者无法new出对象,只能通过构造这模式创建对象
    RetrofitUtils(){

    }

    //先后调用的过程,只有builder创建之后,才能调用此方法
    public LoginApi getTsetService(){
        return loginApi;
    }
    public RegisterApi getRegisterApi(){return registerApi;}
    public ImageListApi getImageListApi(){return  imageListApi;}

    public static class Builder{
        List<CallAdapter.Factory> callAdapterFactories = new ArrayList<>();
        List<Converter.Factory> convertFactories = new ArrayList<>();
        private OkHttpClient okHttpClient;

        public Builder addCallAdapterFactory(CallAdapter.Factory factory){
            callAdapterFactories.add(factory);
            //返回this的作用是可以链式调用
            return this;
        }

        public Builder addConvertFactory(Converter.Factory factory){
            convertFactories.add(factory);
            return this;
        }

        public Builder  client(OkHttpClient okHttpClient){
            this.okHttpClient = okHttpClient;
            return this;
        }

        //真正的业务逻辑操作,是真正构建对象的过程
        public RetrofitUtils build(){
            Retrofit.Builder builder = new Retrofit.Builder();

            if(convertFactories!=null&&convertFactories.size()==0){
                builder.addConverterFactory(GsonConverterFactory.create());
            }
            for(int i=0;i<convertFactories.size();i++){
                builder.addConverterFactory(convertFactories.get(i));
            }
            if(callAdapterFactories!=null&&callAdapterFactories.size()==0){
                builder.addCallAdapterFactory(RxJava2CallAdapterFactory.create());
            }
            for(int i=0;i<callAdapterFactories.size();i++){
                builder.addCallAdapterFactory(callAdapterFactories.get(i));
            }

            //第一步创建retrofit对象
            Retrofit retrofit = builder.client(okHttpClient).baseUrl(ConstantsUrl.base_url).build();
            //第二步创建RxJava
            loginApi = retrofit.create(LoginApi.class);
            registerApi =retrofit.create(RegisterApi.class);
            imageListApi = retrofit.create(ImageListApi.class);
            //第三步请求逻辑，提供给外部访问
            RetrofitUtils retrofitUtils = new RetrofitUtils();
            return retrofitUtils;
        }
    }

}
