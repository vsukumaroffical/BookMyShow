package com.sukumar.bookmyshow.adminlogin;

import com.sukumar.bookmyshow.adminconsole.AdminConsoleView;
import com.sukumar.bookmyshow.theatersetup.TheaterSetupView;
import com.sukumar.bookmyshow.util.ScannerUtil;

public class AdminLoginView {
    AdminLoginModel model;

    public AdminLoginView() {
        model = new AdminLoginModel(this);
    }

    public void getAdminInfo() {
        System.out.println("----[ Admin Login ]---- ");
        System.out.println("Enter admin name");
        String userName = ScannerUtil.getInstance().getString();

        System.out.println("Enter password");
        String password = ScannerUtil.getInstance().getString();
        model.authenticate(userName, password);
    }

    public void onFailedLogin(String alert) {
        System.out.println(alert);
        getAdminInfo();
    }

    public void onSuccessLogin() {
        System.out.println("Login success!");
        new AdminConsoleView().start();
//        new TheaterSetupView().init();
    }

}
