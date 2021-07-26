package com.example.testapp.domain.repository;

import com.example.testapp.data.response.Crypt;

import io.reactivex.rxjava3.core.Single;

public interface CryptRepository {

    Single<Crypt> getDataCrypt();
}
