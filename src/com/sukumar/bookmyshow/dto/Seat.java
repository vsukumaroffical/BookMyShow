package com.sukumar.bookmyshow.dto;

public class Seat {
    private String seatNumber; // e.g., "A1", "B2"
    private boolean isAvailable; // true if the seat is available, false if booked

    // Constructor
    public Seat() {

    }

    // Getter for seat number
    public String getSeatNumber() {
        return seatNumber;
    }

    // Getter for availability status
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for availability status (optional, if you need to update it)
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
