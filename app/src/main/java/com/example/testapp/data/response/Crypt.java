package com.example.testapp.data.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Crypt {
    @SerializedName("data")
    @Expose
    public CryptData data;
}
