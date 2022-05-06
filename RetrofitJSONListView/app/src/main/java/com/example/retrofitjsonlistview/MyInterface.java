package com.example.retrofitjsonlistview;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyInterface {
    String JSONURL = "https://demonuts.com/Demonuts/JsonTest/Tennis/";

    @GET("json_parsing.php")
    Call<String> getString();
}
