package com.example.kuccps.SERVICES;

import com.example.kuccps.MODEL_OBJECT.SignUp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface KuccpApiInterface {
    @POST("/signup.php")
    Call<SignUp> sigupUser(@Body SignUp sign);
    @POST("/signup.php")
    Call<SignUp> User(@Body SignUp sign);

}
