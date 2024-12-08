package com.sukumar.bookmyshow.dto;

public class Movie {
    private byte movieId;
    private String title;
    private String duration;
    private String getTitle;

    public byte getMovieId() {
        return movieId;
    }

    public void setMovieId(byte movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String  getHours() {
        return duration;
    }

    public void setHours(String duration) {
        this.duration = duration;
    }

    public String getGetTitle() {
        return getTitle;
    }

    public void setGetTitle(String getTitle) {
        this.getTitle = getTitle;
    }
}
