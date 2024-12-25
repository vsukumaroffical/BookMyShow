package com.sukumar.bookmyshow.account;

import com.sukumar.bookmyshow.bookmyshowrepository.BookMyShowRepository;
import com.sukumar.bookmyshow.dto.Account;
import com.sukumar.bookmyshow.dto.User;

class AccountModel {
    AccountView view;

    AccountModel(AccountView view){
        this.view = view;
    }

    void addAccount(Account account, String name) {
        BookMyShowRepository repository = BookMyShowRepository.getInstance();
        if(name.equals(repository.getAdminName())){
            repository.setAccount(account,name);
            view.onSuccessAdminAccount();
        }else{
            User user = BookMyShowRepository.getInstance().getUser(name);
            if(user.getAccount() == null){
                repository.setAccount(account,name);
               view.onSuccessAddAccount(name);
            }else{
                view.onFailedAddAccount(name);
            }
        }
    }
}
