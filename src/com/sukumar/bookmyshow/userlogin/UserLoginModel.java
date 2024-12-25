package com.sukumar.bookmyshow.userlogin;

import com.sukumar.bookmyshow.bookmyshowrepository.BookMyShowRepository;
import com.sukumar.bookmyshow.dto.User;
import com.sukumar.bookmyshow.register.RegisterView;

class UserLoginModel {
    UserLoginView userLoginView;
    public UserLoginModel(UserLoginView userLoginView){
        this.userLoginView = userLoginView;
    }

    void authenticate(String userName,String password){
       User user = BookMyShowRepository.getInstance().getUser(userName);

        if(user == null) {
            System.out.println("User does not exist. Please register first.");
            new RegisterView().getRegisterInfo();
            return;
        }

        if(!user.getUserName().equals(userName)){
            userLoginView.onFailedLogin("Invalid User name");
        }else if(!user.getPassword().equals(password)){
            userLoginView.onFailedLogin("Invalid Password");
        }else{
            userLoginView.onSuccessLogin(userName);
        }
    }

}
