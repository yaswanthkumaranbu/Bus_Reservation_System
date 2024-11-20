package com.bookbus.busreserve.model;
import com.bookbus.busreserve.services.*;
import com.bookbus.busreserve.utilities.*;
import java.util.*;

public class BookedDetails {
	ArrayList<Helper> booked ;
	public BookedDetails() {
		booked = Booking.getBooked();
	}
	public ArrayList<Helper> getBooked() {
		return booked;
	}
}
