package com.sukumar.bookmyshow.managemovies;

import com.sukumar.bookmyshow.dto.Movie;
import com.sukumar.bookmyshow.util.ScannerUtil;

public class ManageMovieView {
    ManageMovieModel model;
    public ManageMovieView(){
        model = new ManageMovieModel(this);
    }

   public void getMovieInfo() {
        Movie movie = new Movie();
        System.out.println("----- Movie Info -----");
        System.out.println("Enter the movie name");
        String name = ScannerUtil.getInstance().getString();
        System.out.println("Enter the genre");
        String genre  = ScannerUtil.getInstance().getString();
        System.out.println("Enter the duration");
        String duration = ScannerUtil.getInstance().getString();
        movie.setMovieName(name);
        movie.setDuration(duration);
        movie.setGenre(genre);
        model.createMovie(movie);
    }

    public void showAlert(String alert) {
        System.out.println(alert);
        getMovieInfo();
    }
}
