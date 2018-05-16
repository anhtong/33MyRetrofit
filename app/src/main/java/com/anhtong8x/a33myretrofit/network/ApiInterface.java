package com.anhtong8x.a33myretrofit.network;

import com.anhtong8x.a33myretrofit.models.base.ApiResponse;
import com.anhtong8x.a33myretrofit.models.users.LoginRequest;
import com.anhtong8x.a33myretrofit.models.users.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Administrator on 5/12/2018.
 */

public interface ApiInterface {
    // login
    @POST("/api/Account/login")
    Call<ApiResponse<LoginResponse>> getUserLogin(@Body LoginRequest userLoginInfo);
}
