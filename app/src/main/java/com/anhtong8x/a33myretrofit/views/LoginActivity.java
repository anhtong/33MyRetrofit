package com.anhtong8x.a33myretrofit.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.anhtong8x.a33myretrofit.R;
import com.anhtong8x.a33myretrofit.presenter.users.LoginLogic;

public class LoginActivity extends AppCompatActivity implements LoginInterface, View.OnClickListener{

    Button btnLogin;
    TextView txtToken;
    EditText eUserName, ePassWord;

    LoginLogic loginLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        connectView ();
        loginLogic = new LoginLogic(this);
        btnLogin.setOnClickListener(this);

    }

    void connectView (){
        btnLogin = (Button)findViewById(R.id.btnLogin);
        eUserName = (EditText)findViewById(R.id.eUserName);
        ePassWord = (EditText)findViewById(R.id.ePassWord);
        txtToken = (TextView)findViewById(R.id.token);
    }

    @Override
    public void loginSuccess(String tk) {
        Toast.makeText(this, "Login success", Toast.LENGTH_LONG).show();
        txtToken.setText(tk);
    }

    @Override
    public void loginUnSuccess() {
        Toast.makeText(this, "Login unsuccess", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        String tk = loginLogic.getTokenLogin(eUserName.getText().toString().trim(),ePassWord.getText().toString().trim());

    }
}
