package com.bookbus.busreserve.iservices;

import com.bookbus.busreserve.model.Bus;
import java.util.ArrayList;

public interface IBusReservationServices {

    public boolean is_available(Bus busChosenByUser);

    public int show(ArrayList<Bus> buses);

    public void show(ArrayList<Bus> buses, boolean flag);
}
