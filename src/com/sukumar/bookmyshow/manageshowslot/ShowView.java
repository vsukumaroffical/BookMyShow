package com.sukumar.bookmyshow.manageshowslot;

import com.sukumar.bookmyshow.dto.Show;
import com.sukumar.bookmyshow.dto.Movie;
import com.sukumar.bookmyshow.util.ScannerUtil;

public class ShowView {
    private ShowModel model;

    public ShowView() {
        model = new ShowModel(this);
    }

    void getShowSlotInfo(){
        Show show = new Show();

        System.out.println("Enter the show date");
        String date = ScannerUtil.getInstance().getString();
        System.out.println("Enter the movie name");
        String name = ScannerUtil.getInstance().getString();
        System.out.println("Enter movie start time");
        String startTime = ScannerUtil.getInstance().getString();
        System.out.println("Enter movie end time");
        String endTime = ScannerUtil.getInstance().getString();
        System.out.println("Enter screen name");
        String screenName = ScannerUtil.getInstance().getString();
        show.setShowDate(date);
        show.setMovie(name);
        show.setStartTime(startTime);
        show.setEndTime(endTime);
        show.setScreenName(screenName);
        model.createShowSlot(show);
    }
    public void manageShowSlot(){
        boolean loop = true;
        while(loop){
            System.out.println("1. Add Show Slot");
            System.out.println("2. Display Show slot");
            System.out.println("3. Back");
            byte option = ScannerUtil.getInstance().getByte();
            if(option == 1) {
                getShowSlotInfo();
            }else if(option == 2){
                displayShowSlot();
            }else if(option == 3){
                loop = false;
                System.out.println("Back to admin dashboard");
            }else{
                System.out.println("Enter valid option");
            }
        }
    }

    public void displayShowSlot() {
        System.out.println("\tShow List");
        System.out.println("\t-----------");
        System.out.printf(
                "%-10s | %-10s | %-10s | %-10s | %-15s | %-15s | %-10s | %-10s | %-15s\n",
                "Slot ID", "Show Date", "Start Time", "End Time", "Screen Name", "Movie Name", "Genre", "Duration", "Theater Name"
        );
        for(Show show : model.getShows()){
            Movie movie = model.getMovie(show.getMovieName());
            System.out.printf(
                    "%-10d | %-10s | %-10s | %-10s | %-15s | %-15s | %-10s | %-10s | %-15s\n",
                    show.getSlotId(),
                    show.getShowDate(),
                    show.getStartTime(),
                    show.getEndTime(),
                    show.getScreenName(),
                    movie.getMovieName(),
                    movie.getGenre(),
                    movie.getDuration(),
                    (show.getTheater() != null ? show.getTheater().getTheaterName() : "N/A")
            );
        }
    }
}
