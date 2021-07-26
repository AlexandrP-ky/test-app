package com.example.testapp.data.repository;

import com.example.testapp.data.response.Crypt;
import com.example.testapp.data.service.CryptService;
import com.example.testapp.domain.repository.CryptRepository;
import com.example.testapp.network.NetworkModule;

import io.reactivex.rxjava3.core.Single;

public class CryptRepositoryImpl implements CryptRepository {
    private final CryptService service;

    public CryptRepositoryImpl() {
        service = NetworkModule.getInstance().getRetrofit().create(CryptService.class);
    }

    @Override
    public Single<Crypt> getDataCrypt() {
        return service.getDataCrypt();
    }
}
