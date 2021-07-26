package com.example.testapp.presentation;

import com.example.testapp.data.response.Crypt;
import com.example.testapp.domain.interactor.CryptInteractor;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.observers.DisposableSingleObserver;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class CryptPresenter {
    public CryptPresenter(CryptView cryptView) {
        this.cryptView = cryptView;
        beerInteractor = new CryptInteractor();
    }

    private final CryptView cryptView;
    private final CryptInteractor beerInteractor;

    public void getCrypts() {
        beerInteractor.getDataCrypt()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableSingleObserver<Crypt>() {
                    @Override
                    public void onSuccess(@NonNull Crypt cryptModel) {
                        cryptView.setData(cryptModel);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        int a = 0;
                    }
                });
    }
}

