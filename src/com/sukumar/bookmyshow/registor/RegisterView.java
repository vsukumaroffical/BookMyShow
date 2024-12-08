package com.sukumar.bookmyshow.registor;

import com.sukumar.bookmyshow.account.AccountView;
import com.sukumar.bookmyshow.dto.User;
import com.sukumar.bookmyshow.util.ScannerUtil;

public class RegisterView {
    RegisterModel model;

    public RegisterView(){
        model = new RegisterModel(this);
    }
    public void getRegisterInfo(){
        User user = new User();
        System.out.println("----[ User Register] ----");
        System.out.println("Enter the user name");
        user.setUserName(ScannerUtil.getInstance().getString());

        System.out.println("Enter the password");
        user.setPassword(ScannerUtil.getInstance().getString());

        model.authenticate(user);
    }
    void onSuccessRegister(User user){
        System.out.println(user.getUserName()+" has been successfully registered.");
        new AccountView().getAccountInfo(user.getUserName());
    }

    void onFailedRegister(){
        System.out.println("User is already exists");
        getRegisterInfo();
    }


}
