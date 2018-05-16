package com.anhtong8x.a33myretrofit.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Administrator on 5/16/2018.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        //For registration of token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        //To displaying token on logcat
        Log.d("TOKEN: ", refreshedToken);
    }
}