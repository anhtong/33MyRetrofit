package com.anhtong8x.a33myretrofit.retrofit;

import com.anhtong8x.a33myretrofit.models.UserLogin;
import com.anhtong8x.a33myretrofit.models.UserLoginInfo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Administrator on 5/12/2018.
 */

public interface ApiInterface {

    // login
    @POST("/api/Account/login")
    Call<UserLogin> getUserLogin(@Body UserLoginInfo userLoginInfo);


}
