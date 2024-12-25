package com.sukumar.bookmyshow.managebookticket;

import com.sukumar.bookmyshow.dto.Show;
import com.sukumar.bookmyshow.util.ScannerUtil;

import java.util.List;

public class ManageBookTicketView {
    private String userName;
    ManageBookTicketModel model;
    public ManageBookTicketView(String userName) {
        this.userName = userName;
    }
    public void handleBookTicketOperation() {
        System.out.println("Enter the date");
        String date = ScannerUtil.getInstance().getString();
        System.out.println("Enter the movie name");
        String name = ScannerUtil.getInstance().getString();
        List<Show> list = model.getShowSlot(date, name);

        System.out.println("Select slot");
        byte slotNo = ScannerUtil.getInstance().getByte();
        Show selectedSlot = list.get(slotNo - 1);

    }

}
