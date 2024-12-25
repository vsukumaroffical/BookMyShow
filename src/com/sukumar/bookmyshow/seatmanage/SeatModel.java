package com.sukumar.bookmyshow.seatmanage;

import com.sukumar.bookmyshow.bookmyshowrepository.BookMyShowRepository;
import com.sukumar.bookmyshow.dto.Seat;

import java.util.List;

class SeatModel {
    private SeatView view;
    SeatModel(SeatView view){
        this.view = view;
    }

    public List<Seat> getSeatList(Byte slotId,String screenNane) {
        return BookMyShowRepository.getInstance().getSeats(slotId,screenNane);
    }

    public boolean isAvailableSeats(byte count) {
        return BookMyShowRepository.AvailableSeat();
    }
}
