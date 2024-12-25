package com.sukumar.bookmyshow.theatersetup;

import com.sukumar.bookmyshow.adminconsole.AdminConsoleView;
import com.sukumar.bookmyshow.dto.Screen;
import com.sukumar.bookmyshow.dto.Seat;
import com.sukumar.bookmyshow.dto.Theater;
import com.sukumar.bookmyshow.util.ScannerUtil;

import java.util.*;

public class TheaterSetupView {
    TheaterSetupModel model;

    public TheaterSetupView(){
        model = new TheaterSetupModel(this);
    }
    public void init(){
        model.startSetup();
    }

    public void initiateSetup() {
        System.out.println("----( Setup Theater )----");
        Theater theater = new Theater();

        System.out.println("Enter Theater Name");
        theater.setTheaterName(ScannerUtil.getInstance().getString());

        List<Screen> screenList = getScreenList();
        theater.setScreenList(screenList);

        model.createTheater(theater);
    }

    private List<Screen> getScreenList() {
        System.out.println("Enter the number of screen");
        byte screenCount =  ScannerUtil.getInstance().getByte();
        List<Screen> screenList = new ArrayList<>();
        for (byte count = 1; count <= screenCount;count++){
            System.out.println("----- [ Screen - "+count+" ] -----");
            Screen screen = getScreenInfo();
            screenList.add(screen);
        }
        return screenList;
    }

    private Screen getScreenInfo() {
        Screen screen = new Screen();
        System.out.println("Enter the screen name");
        screen.setScreenName(ScannerUtil.getInstance().getString());
        List<Seat> seatList = getSeats();
        screen.setSeats(seatList);
        return screen;
    }

    private List<Seat> getSeats() {
        List<Seat> seatList = new ArrayList<>();
        System.out.println("Enter the number of seat");
        byte seatCount = ScannerUtil.getInstance().getByte();
        for(byte count = 1; count < seatCount; count++) {
            Seat seat = new Seat();
            seat.setSeatNumber("S"+count);
            seatList.add(seat);
        }
        return seatList;
    }

    public void showAlert(String alert){
        System.out.println(alert);
        initiateSetup();
    }

    public void onSetupComplete(Theater theater,boolean isAlreadyExists) {
        if (!isAlreadyExists)
            System.out.println("\nTheater setup has been completed successfully!\n");
        System.out.println("Theater Name: " + theater.getTheaterName());

    }
}