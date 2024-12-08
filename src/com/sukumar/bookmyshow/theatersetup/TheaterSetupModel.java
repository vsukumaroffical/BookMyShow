package com.sukumar.bookmyshow.theatersetup;

import com.sukumar.bookmyshow.bookmyshowrepository.BookMyShowRepository;
import com.sukumar.bookmyshow.dto.Theater;

public class TheaterSetupModel {
    TheaterSetupView theaterSetupView;

    TheaterSetupModel(TheaterSetupView theaterSetupView){
        this.theaterSetupView = theaterSetupView;
    }
    void startSetup(){
        if(BookMyShowRepository.getInstance().getTheater() == null){
            theaterSetupView.initiateSetup();
        }else{
            theaterSetupView.onSetupComplete(BookMyShowRepository.getInstance().getTheater(),true);

        }
    }
    void createTheater(Theater theater){
        if(!isValidName(theater.getTheaterName())){
            theaterSetupView.showAlert("Invalid Theater Name.It must be between 3 and 20 characters.");
        }else{
            BookMyShowRepository.getInstance().setTheater(theater);
            theaterSetupView.onSetupComplete(theater,false);
        }
    }
    private boolean isValidName(String name){
        return name.length()>=3 && name.length()<20;
    }
}
