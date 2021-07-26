package com.example.testapp.domain.interactor;

import com.example.testapp.data.repository.CryptRepositoryImpl;
import com.example.testapp.data.response.Crypt;
import com.example.testapp.domain.repository.CryptRepository;

import io.reactivex.rxjava3.core.Single;

public class CryptInteractor {
    public CryptInteractor(){
        mRepository = new CryptRepositoryImpl();
    }
    private final CryptRepository mRepository;

    public Single<Crypt> getDataCrypt(){return mRepository.getDataCrypt();}
}
