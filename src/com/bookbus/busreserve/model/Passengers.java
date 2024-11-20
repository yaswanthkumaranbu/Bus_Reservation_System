package com.bookbus.busreserve.model;

public class Passengers {

    private String passengerName;
    private int passengerAge;
    private long passengerPhone;

    public Passengers(String passengerName, int passengerAge, long passengerPhone) {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.passengerPhone = passengerPhone;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public long getPassengerPhone() {
        return passengerPhone;
    }

    public void setPassengerPhone(int passengerPhone) {
        this.passengerPhone = passengerPhone;
    }
}
