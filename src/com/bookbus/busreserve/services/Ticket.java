package com.bookbus.busreserve.services;

import com.bookbus.busreserve.iservices.IBusTicket;
import com.bookbus.busreserve.model.*;
import com.bookbus.busreserve.utilities.*;
import java.util.*;

public class Ticket implements IBusTicket {

    ArrayList<Helper> booked;

    public Ticket() {			// Generates ticket for the Passengers
        booked = new BookedDetails().getBooked();

        Helper helper = booked.get(booked.size() - 1);

        BusDrivers busDriver = helper.getBuses().getBusDrivers();

        Passengers passenger = helper.getPassengers();

        System.out.println("\n--------------------------------------------------\n");

        System.out.println("\t\t\tBUS TICKET");

        System.out.println("\nBUS DETAILS\n");
        
        System.out.println("Departure Date:"+helper.dateString+"\n");

        System.out.println(String.format(
        	    "%-15s: %s%n%-15s: %s%n%-15s: %s%n%-15s: %s%n%-15s: %s%n%-15s: %s%n%-15s: %s%n%-15s: %s",
        	    "Bus Name", helper.getBuses().getName(),
        	    "Bus Number", helper.getBuses().getBusNo(),
        	    "Conditioning", helper.getBuses().isAC() ? "AC" : "NON-AC",
        	    "Bus Type", helper.getBuses().getType(),
        	    "Bus Color", helper.getBuses().getColor(),
        	    "Destination", helper.getBuses().getDestination(),
        	    "Departure", helper.getBuses().getStart(),
        	    "Cost (INR)", helper.getBuses().getCost()
        	));


        System.out.println("\nBUS DRIVER DETAILS\n");

        System.out.println(String.format(
        	    "%-15s: %s%n%-15s: %s%n%-15s: %s",
        	    "Driver Name", busDriver.getDriverName(),
        	    "Driver Age", busDriver.getDriverAge(),
        	    "Driver Phone", busDriver.getDriverPhone()
        	));


        System.out.println("\nYOUR DETAILS\n");

        System.out.println(String.format(
        	    "%-15s: %s%n%-15s: %s%n%-15s: %s",
        	    "Passenger Name", passenger.getPassengerName(),
        	    "Passenger Age", passenger.getPassengerAge(),
        	    "Passenger Phone", passenger.getPassengerPhone()
        	));


        System.out.println("\n\t\t🥰🥰🥰 Happy Journey 🥰🥰🥰");

        System.out.println("\n--------------------------------------------------\n");

    }
}
