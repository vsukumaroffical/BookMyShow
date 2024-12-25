package com.sukumar.bookmyshow.manageseat;

import com.sukumar.bookmyshow.util.ScannerUtil;

public class ManageSeatView {
    ManageSeatModel model ;
    public ManageSeatView(){

    }
    void bookSeat(){

    }
    private void displayManageViewOperation() {
        System.out.println("1.View Seat");
        System.out.println("2.Book Seat");
        System.out.println("3. Back");
    }
    public void handleManageSeatViewOption() {
        boolean loop = true;
        while(loop){
            displayManageViewOperation();
            byte option = ScannerUtil.getInstance().getByte();
            switch(option){
                case 1 ->{

                }
                case 2 ->{

                }
                case 3->{

                }
            }
        }
    }
    public void  getBookSeatInfo(){
        System.out.println("Enter the screen");
    }
}
