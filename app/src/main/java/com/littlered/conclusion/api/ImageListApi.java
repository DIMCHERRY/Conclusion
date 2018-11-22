package com.littlered.conclusion.api;

import com.littlered.conclusion.bean.BaseData;
import com.littlered.conclusion.bean.Image;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ImageListApi {
    @GET("index")
    Call<BaseData<Image>> getImageList(@Query("page") int page, @Query("count") int count);
}
