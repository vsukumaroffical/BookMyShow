package com.sukumar.bookmyshow.dto;

public class Movie {
    private static byte movieId;
    private String movieName;
    private String genre;
    private String duration;
    public Movie(){
        movieId = (byte) (movieId + 1);
    }

    public byte getMovieId() {
        return Movie.movieId;
    }

    public void setMovieId(byte movieId) {
        Movie.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
