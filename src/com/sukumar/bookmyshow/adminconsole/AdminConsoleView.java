package com.sukumar.bookmyshow.adminconsole;

import com.sukumar.bookmyshow.dto.Theater;

public class AdminConsoleView {
    AdminConsoleModel adminConsoleModel;
    Theater theater;
    public AdminConsoleView(Theater theater){
        this.theater = theater;
        adminConsoleModel = new AdminConsoleModel(this);
    }
    public void adminConsole() {
        System.out.println("\nAdmin console");
    }
}
