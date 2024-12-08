package com.sukumar.bookmyshow.account;

import com.sukumar.bookmyshow.bookmyshowrepository.BookMyShowRepository;
import com.sukumar.bookmyshow.dto.Account;
import com.sukumar.bookmyshow.dto.User;

class AccountModel {
    AccountView view;
    AccountModel(AccountView view){
        this.view = view;
    }

    void addAccount(Account account, String userName){

        User user = BookMyShowRepository.getInstance().getUser(userName);
        if(user.getAccount() == null){
           view.onSuccessAddAccount(userName);
        }else{
            view.onFailedAddAccount(userName);
        }
    }

}
