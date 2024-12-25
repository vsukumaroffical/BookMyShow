package com.sukumar.bookmyshow.userconsole;

import com.sukumar.bookmyshow.bookmyshowrepository.BookMyShowRepository;
import com.sukumar.bookmyshow.dto.Account;
import com.sukumar.bookmyshow.dto.Movie;
import com.sukumar.bookmyshow.dto.Show;

import java.util.List;

class UserConsoleModel {
    UserConsoleView userConsoleView;
    List<Integer> tickets;
    Account account;
    private String userName;
    UserConsoleModel(UserConsoleView userConsoleView, String userName){
        this.userName = userName;
        this.userConsoleView = userConsoleView;
//        account = BookMyShowRepository.getInstance().getAccount(userName);
    }

    public List<Movie> getAvilableMovie() {
       return  BookMyShowRepository.getInstance().getShowMovieList();
    }

    public List<Show> getShows() {
       return BookMyShowRepository.getInstance().getShowList();
    }

    public Movie getMovie(String movieName) {
        return BookMyShowRepository.getInstance().getMovie(movieName);
    }
}
