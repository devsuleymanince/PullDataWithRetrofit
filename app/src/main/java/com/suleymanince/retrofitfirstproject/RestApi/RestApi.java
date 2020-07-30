package com.suleymanince.retrofitfirstproject.RestApi;

import com.suleymanince.retrofitfirstproject.Models.Bilgiler;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {
    @GET("/posts")
    Call<List<Bilgiler>> bilgiGetir();
}
