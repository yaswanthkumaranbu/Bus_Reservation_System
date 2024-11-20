package com.bookbus.busreserve.iservices;

import java.util.ArrayList;

import com.bookbus.busreserve.model.Bus;

public interface IBusReservationServices {
	public boolean is_available(Bus busChosenByUser);
	
	public int show(ArrayList<Bus> buses);
	
	public void show(ArrayList<Bus> buses,boolean flag);
}

