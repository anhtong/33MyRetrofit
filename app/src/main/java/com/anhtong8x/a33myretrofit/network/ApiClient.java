package com.anhtong8x.a33myretrofit.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.anhtong8x.a33myretrofit.configs.AppConfig.BASE_URL;

/**
 * Created by Administrator on 5/12/2018.
 */

public class ApiClient {
    private static Retrofit retrofit = null;
    public static Retrofit getRetrofit (){
        if ( retrofit == null ){
            retrofit  = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
