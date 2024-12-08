package com.sukumar.bookmyshow.userlogin;

import com.sukumar.bookmyshow.util.ScannerUtil;

public class UserLoginView {
    UserLoginModel userLoginModel;
    public UserLoginView(){
        userLoginModel = new UserLoginModel(this);
    }

    public void getUserInfo(){
        System.out.println("----[ User Login ]----");

        System.out.println("Enter User name");
        String userName = ScannerUtil.getInstance().getString();

        System.out.println("Enter password");
        String password = ScannerUtil.getInstance().getString();

        userLoginModel.authenticate(userName,password);
    }

    public void onFailedLogin(String alert) {
        System.out.println(alert);
        getUserInfo();
    }

    public void onSuccessLogin() {
        System.out.println("Login success!");
    }
}