package com.sukumar.bookmyshow.dto;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private int theaterId;
    private String theaterName;
    private List<Screen> screenList;

    public Theater(){
        screenList = new ArrayList<>();
    }
    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }
    public boolean containsScreen(String name){
        for (Screen screen : screenList){
            if(screen.getScreenName().equals(name)){
                return true;
            }
        }
        return false;
    }
    public Screen getScreen(String name){
        for(Screen screen :screenList){
            if(screen.getScreenName().equals(name)){
                return screen;
            }
        }
        return  null;
    }


}
