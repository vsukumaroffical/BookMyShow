package com.sukumar.bookmyshow.register;

import com.sukumar.bookmyshow.bookmyshowrepository.BookMyShowRepository;
import com.sukumar.bookmyshow.dto.User;

class RegisterModel {
    RegisterView view;
    RegisterModel(RegisterView view) {
        this.view = view;
    }

    public void authenticate(User user) {
        User selectedUser = BookMyShowRepository.getInstance().getUser(user.getUserName());
        if(selectedUser == null){
            BookMyShowRepository.getInstance().setUsers(user);
            view.onSuccessRegister(user);
        }else{
            view.onFailedRegister();
        }
    }
}
