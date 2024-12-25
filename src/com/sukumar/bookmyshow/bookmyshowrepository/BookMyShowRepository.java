package com.sukumar.bookmyshow.bookmyshowrepository;

import com.sukumar.bookmyshow.dto.*;

import java.util.*;

public class BookMyShowRepository {
    private static BookMyShowRepository repository;
    private Theater theater;
    private final Admin admin;
    private final Map<String , User> users = new HashMap<>();
    private final Map<Byte,Movie> movies = new HashMap<>();
    private final Map<Byte, Show> showSlotMap = new HashMap<>();
    private BookMyShowRepository(){
        admin = new Admin();
        admin.setAdminName("admin");
        admin.setPassword("admin123");
    }
    public static BookMyShowRepository getInstance(){
        if(repository == null){
            repository = new BookMyShowRepository();
        }
        return repository;
    }

    public Theater getTheater(){
        return theater;
    }

    public void setTheater(Theater theater){
        this.theater =theater;
    }

    public User getUser(String userName){
        if(!users.containsKey(userName))
            return null;
        return users.get(userName);
    }

    public void setUsers(User user){
        users.put(user.getUserName(),user);
    }

    public void setAccount(Account account, String name){
        if(name.equals(admin.getAdminName())){
            admin.setAccount(account);
            return;
        }
        users.get(name).setAccount(account);
    }

    public String getAdminName() {
        return  admin.getAdminName();
    }

    public String getAdminPassword(){
        return admin.getPassword();
    }

    public boolean isExistsMovie(String  movieName) {
        for(Movie movie : movies.values()){
            if(movie.getMovieName().equals(movieName)) {
                return true;
            }
        }
        return false;
    }

    public void addMovie(Movie movie) {
        movies.put(movie.getMovieId(),movie);
        System.out.println(movies);
    }

    public void addShowSlot(Show show) {
        showSlotMap.put(show.getSlotId(),show);
        System.out.println(showSlotMap);
    }

    public List<Show> getShowList() {
        return new ArrayList<>(showSlotMap.values());
    }


    public List<Show> getShowSlotList(String date, String name) {
        List<Show> shows = new ArrayList<>();
        for(Show show : showSlotMap.values()){
              if(show.getMovieName().equals(name) && show.getShowDate().equals(date)){
                    shows.add(show);
              }
          }
        return shows;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Movie getMovie(String movieName) {
        for(Movie movie : movies.values()){
            if(movie.getMovieName().equals(movieName))
                return movie;
        }
        return  null;
    }

    public List<Seat> getSeats(String screenName) {
        return Collections.unmodifiableList(theater.getScreen(screenName).getSeats());
    }

    public List<Seat> getSeats(Byte slotId,String screenName) {
        return getSeats(showSlotMap.get(slotId).getScreenName());

    }

    public void updateSeat(String screenName,String seatNumber,boolean isBooked){
        getSeat(screenName,seatNumber).setAvailable(isBooked);
    }

    private Seat getSeat(String screenName,String seatNumber){
        for( Seat seat : theater.getScreen(screenName).getSeats()) {
            if(seat.getSeatNumber().equals(seatNumber)){
                return  seat;
            }
        }
        return null;
    }

    public  List<Movie> getShowMovieList() {
        List<Movie> movieList = new ArrayList<>();
        for(Show show : showSlotMap.values()){
            for(Movie movie : movies.values()) {
                if (movie.getMovieName().equals(show.getMovieName())) {
                    movieList.add(movie);
                }
            }
        }
        return movieList;
    }
}
