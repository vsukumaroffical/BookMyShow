package com.sukumar.bookmyshow.userconsole;

import com.sukumar.bookmyshow.manageshowslot.ShowView;
import com.sukumar.bookmyshow.seatmanage.SeatView;
import com.sukumar.bookmyshow.util.ScannerUtil;

public class UserConsoleView {

    UserConsoleModel model;
    private String userName ;

    public UserConsoleView(String userName){
        model = new UserConsoleModel(this,userName);
        this.userName = userName;
    }
    public void handleUserOperation(){
        new ShowView().displayShowSlot();
        System.out.println("1. Book ticket");
        System.out.println("2. View Ticket");
        System.out.println("3. Logout");
        byte option = ScannerUtil.getInstance().getByte();
        switch(option) {
            case 1 ->{
                handleBookTicketOption();
            }
            case 2->{

            }
            case 3->{

            }
        }
    }

    public void handleBookTicketOption(){
        System.out.println("Enter the slot id");
        Byte slotId = ScannerUtil.getInstance().getByte();
//        new SeatView().displaySeatLayout(slotId);

    }
    public void init(String userName) {
        handleUserOperation();
        this.userName = userName;
    }
}
