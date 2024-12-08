package com.sukumar.bookmyshow.adminlogin;

import com.sukumar.bookmyshow.bookmyshowrepository.BookMyShowRepository;

class AdminLoginModel {
    AdminLoginView view;

    AdminLoginModel(AdminLoginView view){
        this.view = view;
    }

    void authenticate(String adminName,String password){
        BookMyShowRepository repository = BookMyShowRepository.getInstance();
        if(!repository.getAdminName().equals(adminName)){
            view.onFailedLogin("Invalid admin name");
        }else if(!repository.getAdminPassword().equals(password)){
            view.onFailedLogin("Invalid password");
        }else{
            view.onSuccessLogin();
        }
    }
}
