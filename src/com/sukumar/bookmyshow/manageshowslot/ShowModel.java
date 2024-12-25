package com.sukumar.bookmyshow.manageshowslot;

import com.sukumar.bookmyshow.bookmyshowrepository.BookMyShowRepository;
import com.sukumar.bookmyshow.dto.Movie;
import com.sukumar.bookmyshow.dto.Show;

import java.util.List;

public class ShowModel {
    ShowView view;

    public ShowModel(ShowView view) {
        this.view = view;
    }

    public void createShowSlot(Show show) {
        BookMyShowRepository repository = BookMyShowRepository.getInstance();
        repository.addShowSlot(show);
    }

    public Movie getMovie(String movieName) {
        return BookMyShowRepository.getInstance().getMovie(movieName);
    }

    public List<Show> getShows() {
        return BookMyShowRepository.getInstance().getShowList();
    }
}
