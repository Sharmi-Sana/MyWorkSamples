package com.example.ranjini.mvplogin.model;

import android.text.TextUtils;

import com.example.ajit.mvplogin.presenter.LoginPresenter;
import com.example.ajit.mvplogin.view.LoginView;

/**
 * Created by ajit on 08-05-2018.
 */

public class PresenterImpl implements LoginPresenter{

    LoginView mLoginView;
    public PresenterImpl(LoginView loginView){
        this.mLoginView = loginView;
    }
    @Override
    public void performLogin(String Username, String Password) {
    if(TextUtils.isEmpty(Username) || TextUtils.isEmpty(Password))
    {
        mLoginView.loginValidation();
    }
    else if(Username.equals("Ajith") && Password.equals("Ajith"))
    {
        mLoginView.loginSuccess();
    }
    else {
        mLoginView.loginError();
    }
    }
}
