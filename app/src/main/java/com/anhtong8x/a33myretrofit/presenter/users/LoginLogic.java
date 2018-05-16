package com.anhtong8x.a33myretrofit.presenter.users;

import android.util.Log;

import com.anhtong8x.a33myretrofit.models.base.ApiResponse;
import com.anhtong8x.a33myretrofit.models.users.LoginRequest;
import com.anhtong8x.a33myretrofit.models.users.LoginResponse;
import com.anhtong8x.a33myretrofit.network.ApiClient;
import com.anhtong8x.a33myretrofit.network.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 5/16/2018.
 */

public class LoginLogic implements LoginInterface {
    com.anhtong8x.a33myretrofit.views.LoginInterface view;

    public LoginLogic(com.anhtong8x.a33myretrofit.views.LoginInterface view) {
        this.view = view;
    }

    @Override
    public String getTokenLogin(String userName, String passWord) {
        String tk = "";
        try{
            ApiInterface api = ApiClient.getRetrofit().create(ApiInterface.class);
            tk = getToken(api, new LoginRequest(userName, passWord));
        }catch (Exception ex){
            //
        }
        return tk;
    }

    //
    private String getToken (ApiInterface api, LoginRequest userLogin){
        final String[] tk = {""};
        Call<ApiResponse<LoginResponse>> call = api.getUserLogin(userLogin);
        call.enqueue(new Callback<ApiResponse<LoginResponse>>() {
            @Override
            public void onResponse(Call<ApiResponse<LoginResponse>> call, Response<ApiResponse<LoginResponse>> response) {
                //Log.d("LOG", "" + response.code());
                ApiResponse<LoginResponse> u = response.body();
                Log.d("LOG", "" + u.getData().getToken());
                tk[0] = u.getData().getToken();
                if( !tk[0].equals("") ){view.loginSuccess(tk[0]);}
                else { view.loginUnSuccess();}
            }

            @Override
            public void onFailure(Call<ApiResponse<LoginResponse>> call, Throwable t) {
                call.cancel();
            }
        });
        return tk[0];
    }

}
