package com.anhtong8x.a33myretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.anhtong8x.a33myretrofit.models.UserLogin;
import com.anhtong8x.a33myretrofit.models.UserLoginInfo;
import com.anhtong8x.a33myretrofit.retrofit.ApiClient;
import com.anhtong8x.a33myretrofit.retrofit.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ApiInterface api = ApiClient.getRetrofit().create(ApiInterface.class);
        String a = getUserLogin(api, new UserLoginInfo("0972139259","12031990"));

    }

    private String getUserLogin (ApiInterface api, UserLoginInfo userLogin){
       Call<UserLogin> call = api.getUserLogin(userLogin);
       call.enqueue(new Callback<UserLogin>() {
           @Override
           public void onResponse(Call<UserLogin> call, Response<UserLogin> response) {
               Log.d("LOG", "" + response.code());
               UserLogin u = response.body();
               Log.d("LOG", "" + u.getData().getToken());
           }

           @Override
           public void onFailure(Call<UserLogin> call, Throwable t) {
                call.cancel();
           }
       });


        return  "";
    }
}
