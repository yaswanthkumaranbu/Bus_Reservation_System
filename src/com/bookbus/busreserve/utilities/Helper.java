package com.bookbus.busreserve.utilities;

import com.bookbus.busreserve.model.*;
import java.util.*;

public class Helper {

    private Bus buses;
    private Passengers passengers;
    public String dateString;

    Scanner sc = new Scanner(System.in);

    public Helper() {

    }

    public Helper(Bus buses, Passengers passengers, String dateString) {
        this.buses = buses;
        this.passengers = passengers;
        this.dateString = dateString;
    }

    public Bus getBuses() {
        return buses;
    }

    public void setBuses(Bus buses) {
        this.buses = buses;
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }

    public Passengers getPassengersDetails() {      // Gets details from the Passengers
        String passengerName;
        int passengerAge;
        long passengerPhone;
        System.out.print("Enter your name:");

        passengerName = sc.nextLine();

        System.out.print("Enter your age:");

        passengerAge = sc.nextInt();
        System.out.print("Enter your phone number:");

        passengerPhone = sc.nextLong();

        return new Passengers(passengerName, passengerAge, passengerPhone);
    }

}
