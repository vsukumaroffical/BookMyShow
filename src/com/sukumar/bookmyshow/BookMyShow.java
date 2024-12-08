package com.sukumar.bookmyshow;
import com.sukumar.bookmyshow.login.LoginView;

public class BookMyShow {
    private static BookMyShow instance;

    private BookMyShow() {
    }

    static BookMyShow getInstance() {
        return (instance == null) ? (instance = new BookMyShow()) : instance;
    }

    public String getAppVersion() {
        return "1.0.0";
    }

    public String getAppName() {
        return BookMyShow.class.getSimpleName();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to " + getInstance().getAppName() + "!");
        System.out.println("Version: " + getInstance().getAppVersion());
        new LoginView().showLoginOptions();
    }
}