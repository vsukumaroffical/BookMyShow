package com.sukumar.bookmyshow.managemovies;

import com.sukumar.bookmyshow.bookmyshowrepository.BookMyShowRepository;
import com.sukumar.bookmyshow.dto.Movie;

class ManageMovieModel {
    ManageMovieView view;

    ManageMovieModel(ManageMovieView view) {
        this.view = view;
    }

     void createMovie(Movie movie) {
        BookMyShowRepository repository = BookMyShowRepository.getInstance();
        if(repository.isExistsMovie(movie.getMovieName())){
            view.showAlert("Movie is already exists");
        }else{
            repository.addMovie(movie);
        }
    }
}
