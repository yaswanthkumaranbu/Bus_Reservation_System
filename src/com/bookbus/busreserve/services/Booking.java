package com.bookbus.busreserve.services;

import com.bookbus.busreserve.iservices.*;
import com.bookbus.busreserve.model.*;
import com.bookbus.busreserve.utilities.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking implements IBusReservationServices {

    public Booking() {

    }
    private SimpleDateFormat date;

    Bus busChosenByUser;
    private int busCount = 0;

    Scanner sc = new Scanner(System.in);

    final private static ArrayList<Helper> booked = new ArrayList<>();		// Stores the booked details

    public SimpleDateFormat getDate() {
        return date;
    }

    public Bus getBusChosenByUser() {
        return busChosenByUser;
    }

    public int getBusCount() {
        return busCount;
    }

    public Scanner getSc() {
        return sc;
    }

    public static ArrayList<Helper> getBooked() {
        return booked;
    }

    public boolean isFlag() {
        return flag;
    }

    public boolean flag = true;

    @Override
    public boolean is_available(Bus busChosenByUser) {		// Checks the availablility of the seats for specified date and bus
        this.busChosenByUser = busChosenByUser;
        String dateString;
        while (true) {
            System.out.print("\nEnter the Date of boarding (dd-MM-yyyy):");
            dateString = sc.next();
            try {
                date = new SimpleDateFormat("dd-MM-yyyy");
                date.setLenient(false);
                date.parse(dateString);
                break;

            } catch (ParseException ex) {
                System.out.println("Try again! (Invalid date)");
            }
        }
        int count = 0;
        for (Helper helper : booked) {
            if (helper.dateString.equals(dateString)) {
                if (helper.getBuses().getName().equalsIgnoreCase(busChosenByUser.getName())) {
                    busCount = helper.getBuses().getCapacity();
                    count++;
                }
            }
        }

        if (count == 0 || count < busCount) {
            flag = true;
        } else {
            flag = false;
        }

        if (flag) {

            Passengers passengerDetails = new Helper().getPassengersDetails();		// Gets Passenger details
            booked.add(new Helper(busChosenByUser, passengerDetails, dateString));		// Adds the booking
        }

        return flag;
    }

    @Override
    public int show(ArrayList<Bus> buses) {
        for (Bus bus : buses) {
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Bus name : " + bus.getName());
            System.out.println("Bus starts from : " + bus.getStart());
            System.out.println("Departure at : " + bus.getDestination());
            System.out.println("Cost(INR) : " + bus.getCost());
        }
        int userOpt = 1;

        while (true) {
            System.out.println("\n**************************************************");
            System.out.print("Enter 1 to select Dolphin \nEnter 2 to select Hopper \n"
                    + "Enter 3 to select Ant \nEnter other number keys to exit from the application \n");
            System.out.println("**************************************************");
            System.out.print("Choose the bus please : ");

            userOpt = sc.nextInt();

            if (userOpt == 1 || userOpt == 2 || userOpt == 3) {
                return userOpt;
            } else {
                return 0;
            }

        }
    }

    public void show(ArrayList<Bus> buses, boolean flag) {
        for (Bus bus : buses) {
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Bus name : " + bus.getName());
            System.out.println("Bus starts from : " + bus.getStart());
            System.out.println("Departure at : " + bus.getDestination());
            System.out.println("Cost(INR) : " + bus.getCost());

        }
    }

}
