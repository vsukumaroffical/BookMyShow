package com.sukumar.bookmyshow.dto;

public class Seat {
    private byte seatId;
    private String seatNumber;
    private boolean isAvailable;

    public byte getSeatId() {
        return seatId;
    }

    public void setSeatId(byte seatId) {
        this.seatId = seatId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
