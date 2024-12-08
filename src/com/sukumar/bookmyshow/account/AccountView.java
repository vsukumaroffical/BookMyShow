package com.sukumar.bookmyshow.account;

import com.sukumar.bookmyshow.dto.Account;
import com.sukumar.bookmyshow.userconsole.UserConsoleView;
import com.sukumar.bookmyshow.userlogin.UserLoginView;
import com.sukumar.bookmyshow.util.ScannerUtil;

public class AccountView {
    AccountModel model;
    public AccountView(){
        model = new AccountModel(this);
    }

    void onSuccessAddAccount(String userName){
        System.out.println("Congratulations " + userName + "! Your account has been added successfully.");
        new UserLoginView().getUserInfo();
    }

    void onFailedAddAccount(String userName){
        System.out.println("Sorry "+userName+", we couldn't add your account. Please try again");
        getAccountInfo(userName);
    }
    public void getAccountInfo(String userName){
        System.out.println("\nPlease proceed to set up your account details.\n");
        Account account = new Account();
        System.out.println("Enter account no :");
        account.setAccountNo(ScannerUtil.getInstance().getString());
        System.out.println("Enter account holder name");
        account.setAccountHolderName(ScannerUtil.getInstance().getString());
        System.out.println("Enter the bank name");
        account.setBankName(ScannerUtil.getInstance().getString());
        model.addAccount(account,userName);
    }

}
