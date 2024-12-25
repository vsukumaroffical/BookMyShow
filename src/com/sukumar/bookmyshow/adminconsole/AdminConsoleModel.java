package com.sukumar.bookmyshow.adminconsole;

import com.sukumar.bookmyshow.bookmyshowrepository.BookMyShowRepository;
import com.sukumar.bookmyshow.dto.Account;
import com.sukumar.bookmyshow.dto.Admin;
import com.sukumar.bookmyshow.dto.Theater;
import com.sukumar.bookmyshow.dto.Seat;

import java.util.List;

class AdminConsoleModel {
    AdminConsoleView adminConsoleView;
    Theater theater;
    Admin  admin;
    AdminConsoleModel(AdminConsoleView adminConsoleView){
        this.adminConsoleView = adminConsoleView;
        admin = BookMyShowRepository.getInstance().getAdmin();
    }


    public Account getAccount() {
        return admin.getAccount();
    }

    public List<Seat> getSeats(String screenName) {
        return BookMyShowRepository.getInstance().getSeats(screenName);
    }
}
