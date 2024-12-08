package com.sukumar.bookmyshow.dto;

import java.util.List;

public class Screen {

    private int screenId;
    private String screenName;
    private byte bookedCount;
    private byte availableCount;
    private List<Seat> seats ;

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public byte getBookedCount() {
        return bookedCount;
    }

    public void setBookedCount(byte bookedCount) {
        this.bookedCount = bookedCount;
    }

    public byte getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(byte availableCount) {
        this.availableCount = availableCount;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

}
