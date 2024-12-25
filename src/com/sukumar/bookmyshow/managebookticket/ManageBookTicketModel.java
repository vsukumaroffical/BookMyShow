package com.sukumar.bookmyshow.managebookticket;

import com.sukumar.bookmyshow.bookmyshowrepository.BookMyShowRepository;
import com.sukumar.bookmyshow.dto.Show;

import java.util.List;

public class ManageBookTicketModel {
    ManageBookTicketView view;
    ManageBookTicketModel(ManageBookTicketView view){
        this.view = view;
    }

    public List<Show> getShowSlot(String date, String name) {
        return BookMyShowRepository.getInstance().getShowSlotList(date,name);
    }

    public void checkAvailableSeat(String screenName) {
       BookMyShowRepository.getInstance().getSeats(screenName);
    }
}
