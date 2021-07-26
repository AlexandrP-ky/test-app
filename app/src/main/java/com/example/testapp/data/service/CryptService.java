package com.example.testapp.data.service;

import com.example.testapp.data.response.Crypt;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface CryptService {
    @GET(".")
    Single<Crypt> getDataCrypt();
}