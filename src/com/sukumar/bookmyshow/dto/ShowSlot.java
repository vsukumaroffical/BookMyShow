package com.sukumar.bookmyshow.dto;

public class ShowSlot {
    private byte slotId;
    private String startTime;
    private String endTime;
    private byte screenId;
    private byte movieId;

    public byte getSlotId() {
        return slotId;
    }

    public void setSlotId(byte slotId) {
        this.slotId = slotId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public byte getScreenId() {
        return screenId;
    }

    public void setScreenId(byte screenId) {
        this.screenId = screenId;
    }

    public byte getMovieId() {
        return movieId;
    }

    public void setMovieId(byte movieId) {
        this.movieId = movieId;
    }
}