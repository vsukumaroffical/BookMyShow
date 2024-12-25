package com.sukumar.bookmyshow.dto;

public class Show {
    private static byte slotId;
    private String showDate;
    private String startTime;
    private String endTime;
    private String  screenName;
    private String  movieName;
    private Theater theater;
    public Show(){
        slotId = (byte) (slotId + 1);
    }
    public byte getSlotId() {
        return Show.slotId;
    }

    public void setSlotId(byte slotId) {
        Show.slotId = slotId;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
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

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getMovieName() {
        return movieName;
    }
    public void setMovie(String movieName) {
        this.movieName = movieName;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }
}