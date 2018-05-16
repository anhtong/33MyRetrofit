package com.anhtong8x.a33myretrofit.models.users;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 5/16/2018.
 */

public class LoginResponse {

    @SerializedName("id")
    int id;
    @SerializedName("username")
    String username;
    @SerializedName("avatar")
    String avatar;
    @SerializedName("email")
    String email;
    @SerializedName("sex")
    int sex;
    @SerializedName("firstName")
    String firstName;
    @SerializedName("lastName")
    String lastName;
    @SerializedName("token")
    String token;

    public LoginResponse(int id, String username, String avatar, String email, int sex, String firstName, String lastName, String token) {
        this.id = id;
        this.username = username;
        this.avatar = avatar;
        this.email = email;
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
