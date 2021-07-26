package com.example.testapp.data.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CryptData {

    @SerializedName("market_cap_percentage")
    @Expose
    public MarketCapPercentage marketCapPercentage;
}
