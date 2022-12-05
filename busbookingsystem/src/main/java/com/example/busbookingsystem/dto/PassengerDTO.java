package com.example.busbookingsystem.dto;

public class PassengerDTO {
    private int ticketId;
    private String sheetNo;
    private String startHolt;
    private String endHolt;
    private int ticketCount;

    public PassengerDTO() {
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getSheetNo() {
        return sheetNo;
    }

    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
    }

    public String getStartHolt() {
        return startHolt;
    }

    public void setStartHolt(String startHolt) {
        this.startHolt = startHolt;
    }

    public String getEndHolt() {
        return endHolt;
    }

    public void setEndHolt(String endHolt) {
        this.endHolt = endHolt;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public PassengerDTO(int ticketId, String sheetNo, String startHolt, String endHolt, int ticketCount) {
        this.ticketId = ticketId;
        this.sheetNo = sheetNo;
        this.startHolt = startHolt;
        this.endHolt = endHolt;
        this.ticketCount = ticketCount;
    }

    @Override
    public String toString() {
        return "passengerDTO{" +
                "ticketId=" + ticketId +
                ", sheetNo='" + sheetNo + '\'' +
                ", startHolt='" + startHolt + '\'' +
                ", endHolt='" + endHolt + '\'' +
                ", ticketCount=" + ticketCount +
                '}';
    }
}
