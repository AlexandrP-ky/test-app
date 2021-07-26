package com.example.testapp.data.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MarketCapPercentage {

    @SerializedName("btc")
    @Expose
    public float valuesBtc;

    @SerializedName("eth")
    @Expose
    public float valuesEth;

    @SerializedName("usdt")
    @Expose
    public float valuesusdt;

    @SerializedName("bnb")
    @Expose
    public float valuesBnb;

    @SerializedName("ada")
    @Expose
    public float valuesAda;

    @SerializedName("usdc")
    @Expose
    public float valuesUsdc;

    @SerializedName("xpr")
    @Expose
    public float valuesXpr;

    @SerializedName("doge")
    @Expose
    public float valuesDoge;

    @SerializedName("dot")
    @Expose
    public float valuesDot;

    @SerializedName("busd")
    @Expose
    public float valuesBusd;
}

