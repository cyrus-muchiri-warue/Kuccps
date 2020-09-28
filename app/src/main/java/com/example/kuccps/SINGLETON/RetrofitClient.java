package com.example.kuccps.SINGLETON;

import com.example.kuccps.SERVICES.KuccpApiInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static retrofit2.converter.gson.GsonConverterFactory.*;

public class RetrofitClient {
public static final String ip="";
    static Retrofit.Builder builder=new Retrofit.Builder()
            .baseUrl("http://localhost/projectApis/kuccps/courses/v2/request")
            .addConverterFactory(GsonConverterFactory.create());

    static Retrofit retrofit=builder.build();
    public static <S>S gitHubclient(Class<S> serviceClass)
    {
        return retrofit.create(serviceClass);

    }

}
