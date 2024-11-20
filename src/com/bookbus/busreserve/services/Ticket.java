package com.bookbus.busreserve.services;

import com.bookbus.busreserve.iservices.IBusTicket;
import com.bookbus.busreserve.model.*;
import com.bookbus.busreserve.utilities.*;
import java.util.*;

public class Ticket implements IBusTicket{
	ArrayList<Helper> booked;
	public Ticket() {
		booked = new BookedDetails().getBooked();
		
		Helper helper = booked.get(booked.size()-1);
		
		BusDrivers busDriver = helper.getBuses().getBusDrivers();
		
		Passengers passenger = helper.getPassengers();
		
		System.out.println("\n--------------------------------------------------\n");
		
		System.out.println("\t\t\tBUS TICKET");
		
		System.out.println("\nBUS DETAILS\n");
		
		System.out.println("Bus name:"+helper.getBuses().getName());
		System.out.println("Bus name:"+helper.getBuses().getBusNo());
		System.out.println("Bus name:"+(helper.getBuses().isAC() ? "AC" : "NON-AC"));
		System.out.println("Bus name:"+helper.getBuses().getType());
		System.out.println("Bus name:"+helper.getBuses().getColor());
		System.out.println("Bus name:"+helper.getBuses().getDestination());
		System.out.println("Bus name:"+helper.getBuses().getStart());
		
		System.out.println("\nBUS DRIVER DETAILS\n");

		System.out.println("Bus name:"+busDriver.getDriverName());
		System.out.println("Bus name:"+busDriver.getDriverAge());
		System.out.println("Bus name:"+busDriver.getDriverPhone());
		
		System.out.println("\nYOUR DETAILS\n");
		
		System.out.println("Name:" + passenger.getPassengerName());
		System.out.println("Name:" + passenger.getPassengerAge());
		System.out.println("Name:" + passenger.getPassengerPhone());
		
		System.out.println("\t\t\tHappy Journey🥰🥰🥰");

		System.out.println("\n--------------------------------------------------\n");

	}
}
