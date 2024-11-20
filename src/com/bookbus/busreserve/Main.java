package com.bookbus.busreserve;
import com.bookbus.busreserve.model.*;
import com.bookbus.busreserve.services.*;

import java.util.*;
import com.bookbus.busreserve.utilities.*;

import com.bookbus.busreserve.model.*;

public class Main {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 ArrayList<Bus> buses = new ArrayList<>();
		 ArrayList<BusDrivers> busDrivers = new ArrayList<>();
		 
		 Booking book = new Booking();
		 
		 busDrivers.add(new BusDrivers("Driver1",25,7564370123l));
		 busDrivers.add(new BusDrivers("Driver2",25,9080675768l));
		 busDrivers.add(new BusDrivers("Driver3",25,9077384521l));
		 
		 buses.add(new Bus("Dolphin","TN 37 A 9797",true,"Sleeper",1,"Blue","Banglore (Reaches at 11pm)","Coimbatore (Starts at 4pm)",busDrivers.get(0)));
		 buses.add(new Bus("Hopper","TN 37 U 8656",true,"Sleeper",65,"Green","Hydrabad (Reaches at 12pam)","Coimbatore (Starts at 4pm)",busDrivers.get(1)));
		 buses.add(new Bus("Ant","TN 37 E 6785",true,"Sleeper",65,"Red","Madurai (Reaches at 11:30pm)","Coimbatore (Starts at 4pm)",busDrivers.get(2)));
		 
		 
		 int userOpt = 1;
		 
		 System.out.println("\t\t\tBOOKBUS");

	        while (true) {
	    		System.out.println("\n**************************************************");
	            System.out.print("Enter 1 to Book \nEnter 2 to view available buses \nEnter 3 to exit");
	    		System.out.println("\n**************************************************");
	    		System.out.print("Enter your option:");

	            userOpt = sc.nextInt();
	            
	            if (userOpt == 1) {
	            	int busChosenByUser = book.show(buses);
	            	if(busChosenByUser == 0)
	            	{
	            		System.exit(0);
	            	}
	            	if(book.is_available(buses.get(busChosenByUser-1)))
	            	{
	            		System.out.println("\nBooking sucessful!!!");
	            		new Ticket();
	            	}
	            	else {
	            		System.out.println("\nBooking not sucessful! Seats filled");
	            	}
	            }
	            
	            else if(userOpt == 2)
	            {
	            	System.out.print("\nAVAILABLE BUSES");
	            	book.show(buses,true);
	            }
	            
	            else if(userOpt == 3)
	            {
	            	System.exit(0);
	            }
		 

	        }
	}
}
