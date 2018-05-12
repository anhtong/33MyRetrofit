package com.anhtong8x.a33myretrofit.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 5/12/2018.
 */

public class UserLogin {
    @SerializedName("status")
    boolean status;
    @SerializedName("message")
    String message;
    @SerializedName("errorCode")
    int errorCode;
    @SerializedName("data")
    UserLoginData data;
    @SerializedName("totalRecord")
    int totalRecord;

    public UserLogin(boolean status, String message, int errorCode, UserLoginData data, int totalRecord) {
        this.status = status;
        this.message = message;
        this.errorCode = errorCode;
        this.data = data;
        this.totalRecord = totalRecord;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public UserLoginData getData() {
        return data;
    }

    public void setData(UserLoginData data) {
        this.data = data;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }
}
