package com.sukumar.bookmyshow.theatersetup;

import com.sukumar.bookmyshow.adminconsole.AdminConsoleView;
import com.sukumar.bookmyshow.dto.Theater;
import com.sukumar.bookmyshow.util.ScannerUtil;

import java.util.Scanner;

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
        model.createTheater(theater);

    }

    public void showAlert(String alert){
        System.out.println(alert);
        initiateSetup();
    }

    public void onSetupComplete(Theater theater,boolean isAlreadyExists){
        if(!isAlreadyExists)
            System.out.println("\nTheater setup has been completed successfully!\n");
        System.out.println("Theater Name: " + theater.getTheaterName());
        new AdminConsoleView(theater);
    }

}