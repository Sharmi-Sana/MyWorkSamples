package com.example.ranjini.mvplogin.activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ajit.mvplogin.R;
import com.example.ajit.mvplogin.model.PresenterImpl;
import com.example.ajit.mvplogin.presenter.LoginPresenter;
import com.example.ajit.mvplogin.view.LoginView;

public class LoginActivity extends Activity implements View.OnClickListener,LoginView {

    EditText e1,e2;
    Button b1;
    LoginPresenter mLoginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        e1 = findViewById(R.id.username);
        e2 = findViewById(R.id.password);
        b1 = findViewById(R.id.login);
        b1.setOnClickListener(this);
        mLoginPresenter = new PresenterImpl(LoginActivity.this);
    }

    @Override
    public void onClick(View v) {
        String Username = e1.getText().toString();
        String Password = e2.getText().toString();

        mLoginPresenter.performLogin(Username,Password);

    }

    @Override
    public void loginValidation() {
        Toast.makeText(this, "Enter UserName and Password", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void loginError() {
        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
    }
}
