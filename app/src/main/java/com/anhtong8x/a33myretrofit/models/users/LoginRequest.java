package com.anhtong8x.a33myretrofit.models.users;

/**
 * Created by Administrator on 5/16/2018.
 */

public class LoginRequest {
    String username;
    String password;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
