package com.sukumar.bookmyshow.adminconsole;

import com.sukumar.bookmyshow.account.AccountView;
import com.sukumar.bookmyshow.dto.Account;
import com.sukumar.bookmyshow.dto.Seat;
import com.sukumar.bookmyshow.managemovies.ManageMovieView;
import com.sukumar.bookmyshow.manageshowslot.ShowView;
import com.sukumar.bookmyshow.theatersetup.TheaterSetupView;
import com.sukumar.bookmyshow.util.ScannerUtil;

public class AdminConsoleView {
    AdminConsoleModel model;

    public AdminConsoleView(){
        model = new AdminConsoleModel(this);
    }
    private void adminDashboard() {
        boolean loop = true;
        while (loop){
            System.out.println("1. Manage Movie");
            System.out.println("2. Manage show slot");
            System.out.println("3. Add Account");
            System.out.println("4. Display Account Details");
            System.out.println("5. View Seat");
            System.out.println("6. Logout");
            System.out.println("Enter ");
            byte option = ScannerUtil.getInstance().getByte();
            switch (option) {
                case 1->{
                    new ManageMovieView().getMovieInfo();
                }case 2->{
                    new ShowView().manageShowSlot();
                }
                case 3->{
                    new AccountView().getAccountInfo("admin");

                }case 4->{
                   displayAccount();
                }
                case 5->{
                    System.out.println("Enter the screen name");
                    String screenName = ScannerUtil.getInstance().getString();
                    displaySeat(screenName);
                }
                case 6 ->{
                    loop = false;
                    System.out.println("Logged sucessfully");
                }
                default -> {
                    System.out.println("Invalid option try again");
                }
            }
        }
    }

    private void displaySeat(String screenName) {

        System.out.println("\t\t----- "+screenName+" -----\t\t");
        int row = 1;
        for(Seat seat : model.getSeats(screenName)){
            char s = 'A';
            if(!seat.isAvailable()){
                s = 'B';
            }
            System.out.print(seat.getSeatNumber() +"   ["+s+"] ");
            if(row % 10 == 0){
                System.out.println();
            }
                row++;
        }
        System.out.println();
    }
    private void displayAccount() {
        Account account  = model.getAccount();
        System.out.println("---------- Account Details ----------");
        System.out.println("Name      : "+account.getAccountHolderName());
        System.out.println("Acc no    : "+account.getAccountNo());
        System.out.println("Bank name : "+account.getBankName());
        System.out.println("Balance   : "+account.getBalance());
        System.out.println("-------------------------------------");
    }

    public void start() {
        new TheaterSetupView().init();
        adminDashboard();
    }
}
