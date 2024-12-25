package com.sukumar.bookmyshow.seatmanage;

import com.sukumar.bookmyshow.dto.Seat;
import com.sukumar.bookmyshow.util.ScannerUtil;

import java.util.List;

public class SeatView  {
    private final SeatModel model ;
    private String screenName;
    private List<Seat> seatList;

    public SeatView(){
        model = new SeatModel(this);
    }

    public void displaySeatLayout(Byte slotId , String screenName) {
        System.out.println("Seat Layout (O = Available, X = Booked):");
        System.out.println("------------------------------------------------");

        // Determine the maximum column number based on seat numbers
        int maxCols =10;


        // Display column headers
        System.out.print("   "); // Padding for row labels
        for (int col = 1; col <= maxCols; col++) {
            System.out.printf("%3d", col); // Print column numbers
        }
        System.out.println();

        int count = 1;
        char label = 'A';
        for(Seat seat :model.getSeatList(slotId,screenName)){
            if(count == 1) {
                System.out.printf("%-3s",label);
            }
            System.out.print(seat.isAvailable() ? "  O" : "  X");
            if(count == 10){
                System.out.println();
                count = 1;
            }else {
                count ++;
            }
        }
        System.out.println();
        getTotalSeatCount();
    }

    private void getTotalSeatCount() {
        byte count  = ScannerUtil.getInstance().getByte();
        if(model.isAvailableSeats(count)){

        }
    }




}

