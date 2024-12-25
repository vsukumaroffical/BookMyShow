package com.sukumar.bookmyshow.dto;

import java.util.List;

public class Ticket {
    private static int ticketId;
    private int showSlotId;
    private List<Byte> selectedSeatIds;
    private Float totalAmount;

    public int getTicketId() {
        return ticketId =  ticketId + 1;
    }

    public void setTicketId(int ticketId) {
        Ticket.ticketId = ticketId;
    }

    public int getShowSlotId() {
        return showSlotId;
    }

    public void setShowSlotId(int showSlotId) {
        this.showSlotId = showSlotId;
    }

    public List<Byte> getSelectedSeatIds() {
        return selectedSeatIds;
    }

    public void setSelectedSeatIds(List<Byte> selectedSeatIds) {
        this.selectedSeatIds = selectedSeatIds;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }
}
