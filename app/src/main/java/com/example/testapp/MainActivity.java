package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.testapp.data.response.Crypt;

public class MainActivity extends AppCompatActivity implements CryptView {

    public static final String APP_PREFERENCES = "mysettings";
    public static final String APP_PREFERENCES_All = "Crypts";

    private TextView mTextView;
    private CryptPresenter mPresenter;

    SharedPreferences mSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

        mPresenter = new CryptPresenter(this);

        mTextView = findViewById(R.id.crypt_value);

        Button mButtonParse = findViewById(R.id.button_parse);
        Button mButtonShow = findViewById(R.id.button_show);

        mButtonParse.setOnClickListener(v -> mPresenter.getCrypts());
        mButtonShow.setOnClickListener(v -> getResult());
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void setData(Crypt crypt) {
        String mStringCrypts;
        mStringCrypts = ("Btc: " + (crypt.data.marketCapPercentage.valuesBtc) + "\n"
                + "Eth: " + (crypt.data.marketCapPercentage.valuesEth) + "\n"
                + "Ada: " + (crypt.data.marketCapPercentage.valuesAda) + "\n"
                + "Usdc: " + (crypt.data.marketCapPercentage.valuesUsdc) + "\n"
                + "Usdt: " + (crypt.data.marketCapPercentage.valuesusdt) + "\n"
                + "Bnb: " + (crypt.data.marketCapPercentage.valuesBnb) + "\n"
                + "Busd: " + (crypt.data.marketCapPercentage.valuesBusd) + "\n"
                + "Doge: " + (crypt.data.marketCapPercentage.valuesDoge) + "\n"
                + "Dot: " + (crypt.data.marketCapPercentage.valuesDot) + "\n");
        SharedPreferences.Editor editor = mSettings.edit();
        editor.putString(APP_PREFERENCES_All, mStringCrypts);
        editor.apply();
    }

    void getResult() {
        if (mSettings.contains(APP_PREFERENCES_All)) {
            mTextView.setText(mSettings.getString(APP_PREFERENCES_All, ""));
        }
    }
}